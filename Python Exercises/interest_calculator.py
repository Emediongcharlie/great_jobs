amount = int(input("Enter amount:"))
rate = 20 / 100
years = int(input("enter the number of years:"))

count = 1
for i in range(years):
	interest = amount * rate

	total = interest + amount
	amount = total
		
	print(f"years {count} is {amount}")
	count += 1