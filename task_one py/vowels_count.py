vowels = "aeiou"
vowel_count = 0
word = "nelson"

for char in word:
	if char in vowels:
		vowel_count += 1
print(vowel_count)