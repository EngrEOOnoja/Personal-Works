/*Traffic Light
Be a traffic light controller! Ask the user for a color (like “red” or “green”) and
save it in a box. If it’s “green,” say, “Go!” If it’s “red,” say, “Stop!” If it’s “yellow,”
say, “Wait!” Use choices to pick the right message.*/

function trafficLight(colour1,colour2,colour3){

	if ( 'green'  === trafficMessage){
		return 'Go!'
	}
	 if ('red' === trafficMessage){
	 	return 'Stop'
	 }
	 if ('yellow' === trafficMessage){}
		return 'Wait'
}

const prompt = require('prompt-sync')();
const trafficMessage = prompt('Enter your Colour: ');
let message1 = 'red';
let message2 = 'yellow';
let message3 = 'green';
let result = trafficLight(message1, message2, message3,);
console.log(result);
