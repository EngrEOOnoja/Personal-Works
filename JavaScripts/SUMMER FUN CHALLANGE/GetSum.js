/*14.Sum of Numbers
Act like a calculator! Add up the numbers from 1 to 10. Use a box to keep
track of the total, starting at 0. Add each number one by one and repeat until
you’ve added all 10. Show the final total, like “The sum is 55.”*/

function getSum(digit){
	let sum = 0;
	for(let count = 0; count < 10; count++){
		sum += count;
	
	}

	return sum;
}

let digit = 10;
let result = getSum(digit);
console.log(result);




