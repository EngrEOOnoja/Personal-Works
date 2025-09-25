/*Password Checker
Pretend you’re guarding a secret clubhouse! Create a locked box called
“password” set to “secret123.” Ask the user to type a password and save it in
a box. If it matches the locked box, say, “Access granted! Welcome!” If not,
say, “Access denied!” Use a choice to check.*/



function passwordChecker(password){

	if( password == passwordUser){
	return  "Access granted! Welcome!";
		}
	else return  'Access denied!';
}

const prompt = require('prompt-sync')();
const passwordUser = prompt('Enter your password: ');
let password = 'secret123';
let result = passwordChecker(password);
console.log(result);
