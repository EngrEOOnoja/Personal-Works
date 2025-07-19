import java.util.Scanner;
public class StringLength {
public static void main (String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter alphabet" );
char letter = input.next().charAt(0);


if (Character.isLetter(letter))  {

  if(letter == 'a' || letter == 'A' ) {
    System.out.printf("%c Letter is a vowel", letter);
}
else if (letter == 'e' || letter == 'E') {
          System.out.printf("%c Letter is a vowel", letter);
}      
else if (letter == 'i' || letter == 'I') {
          System.out.printf("%c Letter is a vowel", letter);
}
else if (letter == 'o' || letter == 'O') {
          System.out.printf("%c Letter is a vowel", letter);
}
else if (letter == 'u' || letter == 'U') {
          System.out.printf("%c Letter is a vowel", letter);
}else {
     System.out.printf("%c Letter is a Consonant", letter);
}
} else {
     System.out.printf("is Not an Alphabet");
 }

}
}
