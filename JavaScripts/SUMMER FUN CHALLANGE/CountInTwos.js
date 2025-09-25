/*6.Counting by Twos
Count only even numbers, like 2, 4, 6! Start with 2 in a box and show it. Add 2
each time and show the next number, like “4,” “6,” up to 10. Repeat until you
reach 10.*/

function countInTwos(){
	let even = []
	for(let digit = 2; digit < 11; digit ++){
	
	if (digit % 2 === 0) {
		even.push(digit) }

	}
	return even;
	console.log(result)

}


let result = countInTwos();
console.log(result)