number1 = int(input())
number2 = int(input())
number3 = int(input())

highest = number1

if number2 > highest:
	highest = number2 
if number3 > highest:
	highest = number3
print(highest)
