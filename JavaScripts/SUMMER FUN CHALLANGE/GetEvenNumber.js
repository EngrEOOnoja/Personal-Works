/*24.Nested Even Checker
Find even numbers in a list! Go through numbers from 1 to 10, saving each in
a box. Inside that, check if the number is even (divides by 2 with no leftover).
If it is, show it, like “2,” “4,” “6.” Repeat for all numbers and use a choice for
even ones.*/


function getEvenNumber(digit){
	for(let count = 1; count <= 10; count++){
	if (count % 2 == 0){
	return count;	
	}
	}

}


let digit = 10;
let result = getEvenNumber(digit);
console.log(result);






