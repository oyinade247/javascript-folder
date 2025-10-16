number = int(12345)

numbercount = 0

largest = 0

while number > 0:
	remainder = number % 10
	if remainder > largest:
		largest = remainder

	number //= 10
print(largest)

	