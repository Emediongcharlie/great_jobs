
number_of_times = int(input("Enter number of times:"))

counter = 0
zero = 0
positive = 0
negative = 0


for number in range(number_of_times):
	number = int(input("Enter the number needed:"))


	if number < 0:
		negative += 1
		
	elif number > 0:
		positive += 1
		
	elif number == 0:
		zero += 1
		
		
	print(negative)
	print(positive)
	print(zero)	
		
