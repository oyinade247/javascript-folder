divisor = 2
for number in range(1,101):
	if number % divisor != 0 and number % number == 0 :
		print(number)
		
	