/*Multiples of 3
Let’s find numbers that 3 can divide perfectly, like 3, 6, 9! Make the computer
show numbers from 3 to 15, going up by 3 each time. Save each number in a
box and show it, like “3,” “6,” “9,” and so on. Repeat until you reach 15.*/



function getMultipleOf3(digit){
	let answer = 0;
	let count = 1;
	for ( ; count <= 15 ; count++ )
	if (count % 3 == 0) {
	 answer = console.log(count);
	}
	return answer
}


let digit = 15;
let result = getMultipleOf3(digit);
