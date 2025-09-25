/*20.Counting Up
Climb a number ladder! Start with 1 in a box and show it. Add 1 each time and
show the next number, like “2,” “3,” up to 7. Repeat until you reach 7.
These challenges mix choices and repeating things, and some have choices or
repeats inside others (nested). They’re a bit more like puzzles!*/

function countingUp(digit){
	let answer = 0;
	let count = 1;
	for ( ; count <= 7 ; count++ )
	 answer = console.log(count);
	return answer;
}

let digit = 7;
let result = countingUp(digit);
