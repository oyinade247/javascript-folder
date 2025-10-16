number = int(12345)

smallest = number % 10

while number > 0:
	remainder = number % 10
	if remainder < smallest:
		smallest = remainder

	number //= 10
print(smallest)