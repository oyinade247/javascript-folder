number = int(10)
divisor = 2
count_divisor = 0

while number > 1:
	if number % divisor == 0:
		number = number // divisor
	else:
		divisor += 1
	count_divisor += 1
	
print(count_divisor)