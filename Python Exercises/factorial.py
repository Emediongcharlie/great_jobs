number = int(input("Enter number:"))
sum = 0
counter = 1

for counter in range(number + 1):
	counter = counter * number
	sum = sum + counter
	print(counter)