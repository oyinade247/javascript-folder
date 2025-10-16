alphabets = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z"
word = "OyiNade"

count = 0

for letters in word:
	if letters in alphabets:
		count += 1
print(count)