/*17.Temperature Check
Be a weather helper! Ask the user for the temperature (like 25) and save it in
a box. If it’s above 30, say, “Hot!” If it’s 15 to 30, say, “Nice!” If it’s below 15,
say, “Cold!” Use choices to pick the message.*/

function temperatureCheck(temperature){
	if (userInput < 15){
	return   'Cold!';
	}
	else if(userInput  < 30 && userInput > 15)  {
	return 'Nice!';
	}
	else return 'Hot!';
}


const prompt = require('prompt-sync')();
const userInput = prompt('Enter Input : ');
let result = temperatureCheck(userInput);
console.log(result);