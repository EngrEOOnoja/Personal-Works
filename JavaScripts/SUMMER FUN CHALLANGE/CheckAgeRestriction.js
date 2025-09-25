/*13.Age Restriction
You’re checking tickets for a cool show! Create a locked box called “minimumage” set to 10. Ask the user for their age and save it in a box. If they’re 10 or
older, say, “Welcome to the show!” If not, say, “Sorry, you’re too young!” Use a
choice.*/

function checkAgeRestriction(userInput){
	if (userInput >= 10){
	return 'Welcome to the show!';
	}
	else return 'Sorry, you’re too young!';
}




const prompt = require('prompt-sync')();
const userInput = prompt('Enter Age : ');
let result =  checkAgeRestriction(userInput);
console.log(result);

