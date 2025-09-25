/*23.Grade Calculator
Be a school teacher! Ask the user for a test score (0 to 100) and save it in a
box. If it’s 90 or more, say, “A!” If it’s 80 to 89, say, “B!” If it’s 70 to 79, say, “C!”
If it’s below 70, say, “F!” Use choices to pick the grade.*/

function gradeCalculator(grade){

	if (grade > 90) return 'A';
	else if (grade > 80) return 'B';
	else if (grade > 70) return 'C';
	else return 'F';

}


const prompt = require('prompt-sync')();
const grade = prompt('Enter Grade : ');
let result =  gradeCalculator(grade);
console.log(result);






