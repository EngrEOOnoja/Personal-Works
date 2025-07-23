/*import java.util.Scanner;
public class SumDisplay{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

do{
	System.out.print("Enter Integer1 :");
	int digit1 = input.nextInt();
	System.out.print("Enter Integer2 :");
	int digit2 = input.nextInt();
	int sum = digit1 + digit2;

	System.out.print("The Sum is : " sum);
	System.out.print("Enter 1 to continue :");
	int digit3 = input.nextInt();	
	
	} while(digit3 == 1);


}
}
Imagine you have a big word written on a piece of paper, like "abcdefg". Now, 
let's say you want to flip around a part of this word until you find a certain letter, like "d".

Here's what the code does:

1. Find the letter: It looks for the letter "d" in the word "abcdefg" and 
finds out where it is. Let's say "d" is at position 3 (because "a" is 
at position 0, "b" is at position 1, and so on).
2. If the letter is not found: If the letter "d" is not in the word, 
the code just gives you back the original word "abcdefg".
3. Flip the part before the letter: If the letter "d" is found, 
the code flips around the part of the word before "d", including "d" 
itself. So, "abcd" becomes "dcba".
4. Keep the rest the same: The code then adds the rest of the word 
after "d", which is "efg", to the flipped part "dcba".
5. Give you the new word: Finally, the code gives you the new word "dcbaefg".

So, the code is like a special tool that helps you flip around a part
 of a word until you find a certain letter, and then it keeps the rest of the word the same.


*/


/*This pseudocode:
1. Finds the index of the first occurrence of ch in word
2. Returns the original word if ch is not found
3. Builds the result by:
   - Reversing the prefix from index to 0
   - Appending the remaining characters after the index
4. Returns the final string



public String reversePrefix(String word, char ch) {
    int index = word.indexOf(ch);
    if (index == -1) {
        return word;
    }
    StringBuilder prefix = new StringBuilder(word.substring(0, index + 1));
    return prefix.reverse().toString() + word.substring(index + 1);
} */

public class Reverse{
public static void main(String ... args){

public static String reverseWord(String firstLetter, char character){
int index = word.indexOf(ch);
while(index == -1){
	return word;
}
	StringBuilder wordToBeReversed = new StringBuilder(word.substring(0, index + 1));
	return prefix.reverse().toString() + word.substring(index + 1);

	}

}

}