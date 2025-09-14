numbers = [1,2,3,4,5,6]
def get_squares_of_list(digit):
	if(digit < 0):
		raiseValueError
		elif typeof(digit) != digit :
			raiseValueError
		Else:
			return pow(digit, 2)
	
	answer = list(map(get_squares_of_list,numbers))

	
words = ["apple", "banana", "cherry"]
def get_length_of_strings(letter):

	return  len(letter)
	
	answers2 = list (map(get_length_of_strings, words))
	
		
	
	
number2 = [1,2,3,4,5,6]	
def get__to_even_numbers(digit2):
	if(digit2 < 0):
		raiseValueError
		elif digit != typeof(digit):
			raiseValueError
		Else:
			return digit2 % 2 == 0


	answer3 = list(filter( get_even_numbers, numbers))
	
	
	
	
words = ["apple", "banana", "kiwi", "grapes", "cherry"]	
def get__letters_lessthan_five(letter2):
	
	return  (len(letters) <= 2)
		
	answer4 = list(filter(get__letters_lessthan_five, words))