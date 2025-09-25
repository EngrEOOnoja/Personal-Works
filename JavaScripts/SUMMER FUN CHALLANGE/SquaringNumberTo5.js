/*Square Numbers
Let’s make numbers bigger by squaring them (multiplying a number by itself)!
Go from 1 to 5, saving each number in a box. Calculate its square (like 2
squared is 4) and show it, like “1 squared is 1,” “2 squared is 4.” Repeat for all
5 numbers.*/


function squaringNumberTo5(count){

		let answer = 0;	
	for(let count = 1; count <= 5; count++){
	
		  answer = console.log(count + " Squared is :", + count * count);
	}
	  return answer;

	
	}

let count = 1;
let result = squaringNumberTo5(count);







