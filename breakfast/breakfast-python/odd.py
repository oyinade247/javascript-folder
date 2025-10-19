number = 1234
sum = 0
while number > 0:
	remainder = number % 10
	if remainder % 2 != 0:
		sum += remainder
	number = number // 10
print(sum)
