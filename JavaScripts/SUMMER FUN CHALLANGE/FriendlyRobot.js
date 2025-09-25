/*1. Greeting Chooser
Imagine you’re making a friendly robot! Ask the user to type their name and
save it in a box called “name.” If their name is “Alex,” make the computer say,
“Hello, friend!” If it’s any other name, make it say, “Hi, stranger!” Use a choice
to decide which message to show.*/



function greetingchooser(name){

	if(name === 'Alex'){
	  return 'Hello, friend!' ;
	}
	else  return 'Hi, stranger!'
	
	}

 
 const prompt = require('prompt-sync')();
const name = prompt('Enter your name: ');
let result =  greetingchooser.(name)
    console.log(result);
  
 
  
  