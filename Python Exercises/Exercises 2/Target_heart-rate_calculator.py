age = int(input("Enter age in years:"))

maximum_heart_rate = 220 - age
print('maximum_heart_rate is', maximum_heart_rate)


if maximum_heart_rate > 50:
	print("target heart rate")

else (maximum_heart_rate > 85):
	print("Too high")

else:
	print("Too low")


