number = int(12345)


store = 0

while number > 0:
	remainder = number % 10
	store += remainder
	number //= 10
print(store)

	