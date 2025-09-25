/*Even or Odd
Make a game to check if a number is even (like 2, 4, 6) or odd (like 1, 3, 5).Ask the user for a number and save it in a box. If it’s even (divides by 2 with
no leftover), say, “Even!” If not, say, “Odd!” Use a choice to decide.*/


function getNumberMode(digit){

	if(digit % 2 == 0) {
	return "even"
	}
	else return "odd"

}


  const prompt = require('prompt-sync')();
 const digit = prompt('Enter Digit: ');
 let result = getNumberMode(digit);
    console.log(result);



