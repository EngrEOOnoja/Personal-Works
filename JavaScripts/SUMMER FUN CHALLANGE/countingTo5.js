/*Counting to 5
Let’s count like a rocket blasting off! Make the computer count from 1 to 5.
Save each number in a box and show it, like “Number: 1,” “Number: 2,” and
so on, one per line. Repeat this 5 times to show all the numbers.*/

function countingTo5(count){

		let answer = 0;	
	for(let count = 1; count <= 5; count++){
	
		  answer = console.log("Number", + count);
	}
	  return answer;

	
	}

let count = 1;
let result = countingTo5(count);



