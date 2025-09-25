/*17.Temperature Check
Be a weather helper! Ask the user for the temperature (like 25) and save it in
a box. If it’s above 30, say, “Hot!” If it’s 15 to 30, say, “Nice!” If it’s below 15,
say, “Cold!” Use choices to pick the message.*/



function temperstureCheck(temperature){
	if (userInput > 30){
	return  'Hot!';
	}
	elseif(userInput  > 15) {
	return 'Nice!'”;
	}
	else return 'Cold!';
}

let temperature = 25;
let result = temperstureCheck(temperature);
console.log(result);
