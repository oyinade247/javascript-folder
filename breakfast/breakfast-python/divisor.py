number = int(10)
divisor = 2


while number > 1:
	if number % divisor == 0:
		number = number // divisor
	else:
		divisor += 1
	print(divisor)
	