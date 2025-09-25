/*19 Create a magic number game! Make a locked box called “magic number” set
to 42. Ask the user for a number and save it in a box. If they pick 42, say, “You
found the magic number!” If not, say, “Keep looking!” Use a choice.*/

function getMagicNumber(userInput){
	if (userInput == magicNumber){
	return 'You found the magic number!';
	}
	else return 'Keep looking!';
}

const magicNumber = 42;
const prompt = require('prompt-sync')();
const userInput = prompt('Enter Number : ');
let result =  getMagicNumber(userInput);
console.log(result);













