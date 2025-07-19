 import java.util.Scanner;
	public class Smallest{
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	   System.out.print("Enter first interger: ");
	   int Number1 = input.nextInt();
	   System.out.print("Enter second interger: ");
	   int Number2 = input.nextInt();
	   System.out.print("Enter third interger: ");
	   int Number3 = input.nextInt();

		int Sum = (Number1 + Number2 + Number3);
		 System.out.printf("Sum is %d%n", Sum);
		int Average = (Sum / 3);
		 System.out.printf("Average is %d%n", Average);
		int Product = (Number1 * Number2 * Number3);
		 System.out.printf("Product is %d%n", Sum);

		intsmallest = Number1;
		 if (Number2 > Number1 && Number3 > Number1)  {
		 System.out.printf("Number1 is %d%n", smallest);
			}
		int smallest = Number2;
		 if (Number3 >  Number2 && Number1 > Number2)  {
		 System.out.printf("Number2 is %d%n", smallest);
			}
		int smallest = Number3;
		 if (Number1 > Number3 && Number2 > Number3)  {
		 System.out.printf("Number1 is %d%n", smallest);
			}
		int largest = Number1;
		 if (Number2 < Number1 && Number3 < Number1)  {
		 System.out.printf("Number1 is %d%n", largest);
			}
		int largest = Number2;
		 if (Number1 < Number2 && Number3 < Number2)  {
		 System.out.printf("Number2 is %d%n", largest);
			}
		int largest = Number3;
		 if (Number1 < Number3 && Number2 < Number3)  {
		 System.out.printf("Number3 is %d%n", largest);
			}
	}
}