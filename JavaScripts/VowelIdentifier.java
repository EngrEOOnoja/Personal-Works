import java.util.Scanner;
public class VowelIdentifier{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Letters");
	String vowel = "aeiou";
	String word = input.nextLine().toLowerCase();
	
	int index = 0;
	int vowelTotal = 0;
	
	
	for (index = 0; index	 < word.length(); index++){
	 char letter = word.charAt(index);
	 if ((letter == vowel.charAt(0)) || (letter == vowel.charAt(1)) || (letter == vowel.charAt(2)) || (letter == vowel.charAt(3)) || (letter == vowel.charAt(4)))
	 {
	 vowelTotal++;
	 }
	 }
	System.out.println("The Number of Vowels are :" + vowelTotal);
	
	
	
	}

}