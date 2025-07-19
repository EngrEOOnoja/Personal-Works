import java.util.Scanner;
   public class LeapYear{

	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Year : ");
        int number1 = input.nextInt();
	
	if (number1 < 1000 || number1 > 10000 || number1 < 0 ) {
	System.out.println("Invalid  Number is not a current Year");
	}
	else if ((number1 % 4 == 0 && number1 % 100 !=0) || number1 % 400 == 0) {
	System.out.println("True");
	}
	
	else {
	System.out.println("Flase");
	}
	
}
}


