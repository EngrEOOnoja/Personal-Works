/*Favorite Number
Create a locked box called “favorite number” and set it to 7 (it won’t change).
Ask the user to guess a number and save it in a box. If they guess 7, make
the computer say, “That’s my favorite number!” If not, say, “Nice try, guess
again!” Use a choice to check the guess.*/

function favoriteNumber(guess){

const favouriteConstNumber = 7;
	if( favouriteConstNumber == guess){
	return "That’s my favorite number!"
	}
	else return  "Nice try, guess again!";
			


}





  const prompt = require('prompt-sync')();
 const guess = prompt('Enter your Guess: ');
 let result = favoriteNumber(guess);
    console.log(result);



