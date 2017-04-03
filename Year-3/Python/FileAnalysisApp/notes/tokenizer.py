import nltk
f=open("C:/Users/danha/Desktop/webapp/test.txt","r")
tokens=[]
for line in f:
    tokens+=nltk.word_tokenize(line)
print (tokens)
f.close()
