##Testing to make sure hashs are the same.

import hashlib

f=open("C:/Users/danha/Desktop/webapp/uploads/test.txt","r")
data=f.read()

x="there are examples, and there is the correct way to do something."

text0_digest = sha_hash = hashlib.sha256(bytes(data,encoding='utf-8')).hexdigest()

text1_digest = sha_hash = hashlib.sha256(bytes(x,encoding='utf-8')).hexdigest()

print(text0_digest)
print(text1_digest)
