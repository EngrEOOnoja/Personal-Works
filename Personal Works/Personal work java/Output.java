import java.util.Scanner;
	public class Output{
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  int x = input.nextInt();
	  int y = input.nextInt();
	   	System.out.printf("x = %d%n", x + 5);
		System.out.printf("Value of %d *%d is %d\n", x, y, (x * y) );
		System.out.printf("x is %d and y is %d", x, y);
		System.out.printf("%d is not equal to %d\n", (x + y), (x * y) );
	}
}

