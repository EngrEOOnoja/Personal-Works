import java.util.Scanner;
   public class Parliduome{

	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Digit : ");
        int number1 = input.nextInt();

	
	int digit1 = (number1 / 1000);
	int digit2 = (number1 % 1000)/100;
	int digit3 = (number1 % 100) / 10;
	int digit4 = (number1 % 10) / 1 ;

	int parliduome = ((digit4 * 1000) + (digit3 * 100) + (digit2 * 10) + (digit1 * 1)); 
	
	
	if (digit2 == digit4 && number1 < 1000 || digit3 == digit4 && number1 < 100) {
	 System.out.printf("Number is a paliduome %d%n", number1);
	}

	else if (number1 - parliduome == 0) {
	System.out.printf("Number is a Parliduome %d%n", number1);
	}

	else if (number1 < 0 || number1 < 1000 && number1 > 9999) {
	System.out.printf("Number is not a 3 digit %d%n" + number1);
	}
	
	else {
	System.out.printf("Number is not a Parliduome %d%n", number1);
	}
	
}
}


