pass_mark = 45
passes = 0
fail = 0

for student in range(15):

	score = int(input("Enter Score:"))

	if score > pass_mark:
		passes = passes + 1

	else:		
		fail = fail + 1

print("pass:", passes)
print("fail:", fail)

