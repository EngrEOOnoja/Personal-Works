public class ReverseMethod
{
public static void main(String ... args){
String ope = "Silver";
char ch = 'z';

	reverseWord(ope, ch);
System.out.print(reverseWord(ope, ch));
}

public static String reverseWord(String firstLetter, char character){
int index = firstLetter.indexOf(character);
while(index == -1){
	return firstLetter;
}
	StringBuilder wordToBeReversed = new StringBuilder(firstLetter.substring(0, index + 1));
	return wordToBeReversed.reverse().toString() + firstLetter.substring(index + 1);

	}

}
