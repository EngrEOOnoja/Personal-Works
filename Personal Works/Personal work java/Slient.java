import java.util.*;
public class Slient {
public static void main (String[] args) {
 Random guess = new Random();
 Scanner input = new Scanner(System.in);
 System.out.println("Enter 1 for Tail, 0 for Head.  ;");
 int coinToss = guess.nextInt(2);
 int game = (int) input.nextDouble();

if(game == 0 || game == 1 ){
   System.out.println("Invalid input MUMU" );
	}
else if (coinToss == game) {
   System.out.println("Correct Guess");
 }
else {System.out.println("Incorrect input");}


}
}