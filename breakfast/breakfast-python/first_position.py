vowels = "aeiou"
word = "oyinade"
position = word[0]

for letters in word:
	if letters in vowels:
		 position = letters
print(position)