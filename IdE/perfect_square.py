
import math

def are_perfect_squares(numbers):
	square = []
	for num in numbers:
		square.append(math.sqrt(num) % 1 == 0)
	return square
    
    
    
numbers = [2, 4, 5, 6, 7, 9, 12, 25]
result = are_perfect_squares(numbers)
print(result) 
