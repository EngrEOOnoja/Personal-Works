
//sample payroll calculation.
import java.util.Scanner;// program uses class scanner
 
public class Product{
public static void main(String[] args) {
	// create a Scanner to obtain input from the command window.
	Scanner input = new Scanner(System.in);

	System.out.printf("Enter Integer: "); //prompt
	int numberb = input.nextInt(); // read first number from user.

	System.out.printf("Enter Integer: "); //prompt
	int numberc = input.nextInt(); // read second number from user.

	int a = numberb * numberc; // multiply b*c.

	System.out.printf("a is %d%n", a); // display multiplication
}
 }


