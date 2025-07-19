
//sample payroll calculation.
import java.util.Scanner;// program uses class scanner
 
public class Onoja{
public static void main(String[] args) {
	// create a Scanner to obtain input from the command window.
	Scanner input = new Scanner(System.in);

	System.out.print("Enter two Numbers: "); //prompt
	int number1 = input.nextInt(); // read first number from user.

	System.out.print("Enter two Numbers: ");
	int number2 = input.nextInt(); // read second number from user.

	int Answer = number1-number2; // multiply 1-2
	System.out.printf("the correct answer is = %d%n", Answer);
}
 }


