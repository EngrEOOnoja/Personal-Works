import java.util.Scanner;
	public class SquareSum {
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	   System.out.print("Enter first interger: ");
	   int Number1 = input.nextInt();
	   System.out.print("Enter second interger: ");
	   int Number2 = input.nextInt();
	  
	
		int Square1 = (Number1*Number1);
		 System.out.printf("Square1 is %d%n", Square1);
	
		int Square2 = (Number2 * Number2);
		 System.out.printf("Square2 is %d%n", Square2);
		 
      		 int digit1 = (Square1 / 10);
       		 int digit2 = (Square1 % 10) / 1;

		 int digit3 = (Square2 / 10);
       		 int digit4 = (Square2 % 10) / 1;

		int Sum1 = (digit1 + digit2 );
		if (Sum1 > 5) {
		 System.out.printf("Sum1 is %d%n", Sum1);
}

		 Sum1 = (digit1 + digit2 );
		if (Sum1 < 5) {
		 System.out.printf("Sum1 is not a two digit %d%n", Sum1);
}

	
		int Sum2 = (digit3 + digit4 );
		if (Sum2 > 5) {
		System.out.printf("Sum2 is %d%n", Sum2);
}

		 Sum2 = (digit3 + digit4 );
		if (Sum2 < 5) {
		System.out.printf("Sum2 is not a two digit %d%n", Sum2);
}

	}
}