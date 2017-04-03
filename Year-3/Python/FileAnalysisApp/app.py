# app.py - File Analysis App
# Author: Daniel Hayden
# Stu. No: C0137009

import os
import json
from flask import Flask, request, redirect, url_for, render_template, send_from_directory
from werkzeug.utils import secure_filename
from nltk.tokenize import RegexpTokenizer
from collections import Counter
from pymongo import MongoClient
import datetime
import hashlib


client = MongoClient('localhost', 27017)
db = client.analysisWebApp # Database

UPLOAD_FOLDER = 'C:/Users/danha/Desktop/webapp/uploads/'
ALLOWED_EXTENSIONS = set(['txt'])

app = Flask(__name__)
app.config['UPLOAD_FOLDER'] = UPLOAD_FOLDER

##Make sure file has an allowed extension.
def allowed_file(filename):
    return '.' in filename and \
           filename.rsplit('.', 1)[1].lower() in ALLOWED_EXTENSIONS

##Homepage.
@app.route('/', methods=['GET', 'POST'])
def home():
    return render_template('home.html',
                            title='Data Analysis App')

##Analyse page, taken to after form is submitted.
@app.route('/analyse', methods=['GET', 'POST'])
def upload_file():
    tokens=0
    results=0
    token=0
    if request.method == 'POST':
        # check if the post request has the file part
        if 'file' not in request.files:
            flash('No file part')
            return redirect(request.url)
        file = request.files['file']
        # if user does not select file, browser also
        # submit a empty part without filename
        if file.filename == '':
            flash('No selected file')
            return redirect(request.url)
        if file and allowed_file(file.filename):
            filename = secure_filename(file.filename)
            file.save(os.path.join(app.config['UPLOAD_FOLDER'], filename))
            tokens=tokenize(filename)
            #results=check_data(tokens)
            resultsA=[]
            notFound=[]
            endL=[]
            tokensFound=[]
            if checkHistory(filename)==0:
                dataTakenFromVar="FROM NEW FILE"
                counts=Counter(tokens)
                for x in sorted(counts.keys()):
                     try:
                        results=check_data(x)
                        token=x
                        resultsA.append(results)
                        for k, v in sorted(counts.items()):
                            if k==token:
                                l=[]
                                l.append(k)
                                l.append(v)
                                l.append(results)
                                endL.append(l)
                     except:
                        for k, v in sorted(counts.items()):
                            if k==x:
                                l=[]
                                l.append(k)
                                l.append(v)
                                notFound.append(l)
                tokensFound = [x for x in tokens if x not in notFound]
                insertToDatabase(filename,endL,notFound)
            else:
                dataTakenFromVar ="FROM DATABASE"
                dbResult = checkHistory(filename)
                endL = dbResult.distinct("found")
                notFound = dbResult.distinct("notfound")
                tokensFound=[]
                
    return render_template('results.html',
                         title='Data Analysis App',
                         tokens=tokens,
                         token=token,
                         endL=endL,
                         notFound=notFound,
                         dataTakenFromVar=dataTakenFromVar)

##Insert new analysis into database
def insertToDatabase(filename,endL,notFound):
    hashOfFile = hashFileContents(filename)
    post = {"hash": hashOfFile,
            "filename": filename,
            "found": endL,
            "notfound": notFound,
            "date": datetime.datetime.utcnow()}
    collection = db.files # Table
    collection.insert_one(post)
    return 0

##Check the current files hash with the databse to prevent CPU overkill
def checkHistory(filename):
    hashOfFile = hashFileContents(filename)
    if db.files.find({"hash": hashOfFile}).count() >= 1:
        return db.files.find({"hash": hashOfFile})
    else:
        return 0

##Get the Hash
def hashFileContents(filename):
    f=open("C:/Users/danha/Desktop/webapp/uploads/"+filename,"r")
    data=f.read()
    hashed=""
    hashed = sha_hash = hashlib.sha256(bytes(data,encoding='utf-8')).hexdigest()
    return hashed

##Use nltk to tokenize the input file.
def tokenize(filename):
    f=open("C:/Users/danha/Desktop/webapp/uploads/"+filename,"r")
    tokens=[]
    tokenizer = RegexpTokenizer(r'\w+')
    for line in f:
        tokens+=tokenizer.tokenize(line.lower())
    f.close()
    return tokens

##Pass the toekens dict into this function to check each token against the json file.
def check_data(tokens):
    with open('C:/Users/danha/Desktop/webapp/ea-thesaurus-lower.json') as normsf:
            norms = json.load(normsf)
            result=norms[tokens][0:3];
    return result

##History.
@app.route('/history')
def history1():
    dbFiles=[]
    for post in db.files.find():
        dbFiles.append(post)
    return render_template('history.html',
                                title='Data Analysis App',
                                dbFiles=dbFiles)



@app.route('/history/<filename>')
def history(filename):
    dataTakenFromVar ="FROM DATABASE"
    dbResult = checkHistory(filename)
    endL = dbResult.distinct("found")
    notFound = dbResult.distinct("notfound")
    tokensFound=[]
    tokens=[]
    token=[]
    return render_template('results.html',
             title='Data Analysis App',
             tokens=tokens,
             token=token,
             endL=endL,
             notFound=notFound,
             dataTakenFromVar=dataTakenFromVar)       
    
        
if __name__ == '__main__':
    app.run(debug=True)


