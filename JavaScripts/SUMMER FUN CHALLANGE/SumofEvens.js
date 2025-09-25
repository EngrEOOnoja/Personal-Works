/*Write a function that will return the count of distinct case-insensitive alphabetic
characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase
and lowercase) and numeric digits.
Examples
Input => “abcde”
Output => 0
Input => “a11BAcb”
Output => 3*/



function countDuplicates(String) {
  let upperStr = inputString.toUpperCase();
  let charCount = {};

  Count occurrences of each character
  for (let count of upperStr) {
    charCount[count] = (charCount[count] || 0) + 1;
  }

  Count how many characters appear more than once
  let duplicates = 0;
  for (let index in charCount) {
    if (charCount[index] > 1) {
      duplicates++;
    }
  }

  return duplicates;
}

console.log(countDuplicates("abcde"));      
console.log(countDuplicates("a11BAcb"));   