/*15.Guess the Animal
Make a fun animal guessing game! Create a locked box called “my animal”
set to “dog.” Ask the user to guess an animal and save it in a box. If they
guess “dog,” say, “Correct! It’s a dog!” If not, say, “Nope, it’s a dog!” Use a
choice.*/



function animalGuessingGame(name){
	if ( userInput === 'dog'){
		return 'Correct! It’s a dog!';		
	}
	else return 'Nope, it’s not a dog!';

}


const prompt = require('prompt-sync')();
const userInput = prompt('Enter Input : ');
const myAnimal = "dog";
let result = animalGuessingGame(myAnimal);
console.log(result);


