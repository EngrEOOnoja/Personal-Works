import java.util.Scanner;
public class BookLetter1 {
public static void main (String[] args){
Scanner letter = new Scanner(System.in);
char alphabet = letter.next().CharAT(0);

char vowels = "a","e","i","o","u";
char vowel =   "A","E","I","O","U";

if (letter == vowels || letter == vowel) {
    System.out.println( "Letter is a Vowel");
     }
else System.out.println("Letter is a cosonant");

}
}