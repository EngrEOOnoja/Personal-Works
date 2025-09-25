/*Positive or Negative
Be a number detective! Ask the user for a number and save it in a box. If it’s
bigger than 0, say, “Positive!” If it’s 0 or less, say, “Negative or zero!” Use a
choice to decide what to say.*/



function positiveOrNegative(userDigit){

	if(userDigit > 0){
	return "Positive";
	}
	else if( userDigit < 0) {
	return "Negative";
	}
	else return "Zero";
	
}


const prompt = require('prompt-sync')();
const userDigit = prompt('Enter Digit : ');
let result = positiveOrNegative(userDigit);
console.log(result);






