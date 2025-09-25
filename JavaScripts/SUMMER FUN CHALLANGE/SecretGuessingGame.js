/*Number Guessing Game
Make a number guessing game! Create a locked box called “secret” set to 8.
Keep asking the user for a number and save it in a box. If they guess 8, say,
“Correct!” and stop. If not, say, “Try again!” and keep asking. Use a choice to
check each guess.*/

function secretGuessingGame(userInput){
	const secret = 8;
	let count = 0;
	while(userInput !== secret){
	return 'Try again';	
	count ++;
	userInput = parseInt(prompt('Enter Number : '));
	}
	return 'Correct';
}


const prompt = require('prompt-sync')();
let userInput = parseInt(prompt('Enter Number : '));
let result =  secretGuessingGame(userInput);
console.log(result);
