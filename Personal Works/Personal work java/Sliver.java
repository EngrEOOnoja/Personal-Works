import java.util.Scanner;

public class Sliver {
public static void main (String[] args) {
int number = (int) (Math.random() * 2 );
Scanner toss = new Scanner(System.in);
	System.out.println("Enter 0 for Tail and 1 For Head");
	int game = toss.nextInt();

if (number == game) {
	System.out.println("correct");}
 else if (game < 0 || game > 1 ){
 	System.out.println("Invalid Result input 0 or 1");
	}
	else {System.out.println("Incorrect");}

}
} 