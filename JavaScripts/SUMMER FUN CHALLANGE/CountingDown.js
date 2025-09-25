/* Counting Down
Create a game timer countdown! Start with 10 in a box and make the
computer show it. Then subtract 1, show the new number, and keep going
until you reach 1. Repeat this, showing each number, like “10,” “9,” “8,” and so
on.*/


function countingDown(digit){
	let answer = 0;
	let count = 10;
	for ( ; count >= 1 ; count-- )
	 answer = console.log(count);
	return answer;
}

let digit = 10;
let result = countingDown(digit);









