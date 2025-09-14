const prompt = require('prompt-sync')({sigint: true});

function main() {
    const numberOfStudents = parseInt(prompt("Enter Number of Students: "));
    const numberOfSubjects = parseInt(prompt("Enter Number of Subjects: "));

    const studentNames = [];
    const studentGrades = [];
    const studentAverages = new Array(numberOfStudents);
    const studentPositions = new Array(numberOfStudents);

    for (let i = 0; i < numberOfStudents; i++) {
        let name = prompt(`Student Name: `);
        studentNames.push(name);

        studentGrades[i] = [];
        let total = 0;

        for (let j = 0; j < numberOfSubjects; j++) {
            let grade;
            while (true) {
                grade = parseFloat(prompt(`Enter grade for subject ${j + 1}: `));
                if (grade >= 0 && grade <= 100) {
                    break;
                } else {
                    console.log("Score must be between 0 - 100. Try again.");
                }
            }
            studentGrades[i][j] = grade;
            total += grade;
        }

        studentAverages[i] = total / numberOfSubjects;

        console.log(`Stu nam: ${name}`);
        console.log("Grades:");
        for (let j = 0; j < numberOfSubjects; j++) {
            console.log(`Grade for subject ${j + 1}: ${studentGrades[i][j]}`);
        }
        console.log(`Average grade: ${studentAverages[i].toFixed(2)}\n`);
    }

        for (let i = 0; i < numberOfStudents; i++) {
        let position = 1;
        for (let j = 0; j < numberOfStudents; j++) {
            if (studentAverages[i] < studentAverages[j]) {
                position++;
            }
        }
        studentPositions[i] = position;
    }

   
    let header = "Stu N\t";
    for (let j = 0; j < numberOfSubjects; j++) {
        header += `Sub${j + 1}\t`;
    }
    header += "Ave\tPos";
    console.log(header);

    for (let i = 0; i < numberOfStudents; i++) {
        let line = `${studentNames[i]}\t`;
        for (let j = 0; j < numberOfSubjects; j++) {
            line += `${studentGrades[i][j]}\t`;
        }
        line += `${studentAverages[i].toFixed(2)}\t${studentPositions[i]}`;
        console.log(line);
    }
}

main();
