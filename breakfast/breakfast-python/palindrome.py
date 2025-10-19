number2 = 1234
number = number2
divided_number = ""

while number > 0:
	remainder = number % 10
	divided_number += str(remainder)
	number = number // 10
if str(number2) == divided_number:
	print("it is a palindrome")
else:
	print("it is not a palindrome")
