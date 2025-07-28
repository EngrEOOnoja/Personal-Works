import java.util.Scanner;
public class VowelTry{
public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter sentence :");
	String vowels = "AEIOU";
	String word = input.nextLine().toUpperCase();
	
	
	int vowelCount=0;
	
	for (int index = 0; index < word.length(); index++){
		char letter = word.charAt(index);
		if ((letter == vowels.charAt(0)) || (letter == vowels.charAt(1)) || (letter == vowels.charAt(2)) || (letter == vowels.charAt(3)) || (letter == vowels.charAt(4))){
		vowelCount++;}	
	} 
	
		System.out.println("The Number of Vowel Is :" + vowelCount );
		
}

}