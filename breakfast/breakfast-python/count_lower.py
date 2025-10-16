alphabets = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z"
word = "Mr Femi"

count = 0

for letters in word:
	if letters in alphabets:
		count += 1
print(count)