import java.util.Scanner;
	public class Avesmalargest{
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	   System.out.print("Enter first interger: ");
	   int Number1 = input.nextInt();
	   System.out.print("Enter second interger: ");
	   int Number2 = input.nextInt();
	   
		int Sum = (Number1 + Number2 );
		 System.out.printf("Sum is %d%n", Sum);
	
		int Product = (Number1*Number1 * Number2 * Number3);
		 System.out.printf("Product is %d%n", Product);

		int One = Number1;
		 if (Number2 > Number1 && Number3 > Number1)  {
		 System.out.printf("Smallest is %d%n", Number1);
			}
		int  Two = Number2;
		 if (Number3 >  Number2 && Number1 > Number2)  {
		 System.out.printf("Smallest is %d%n", Number2);
			}
		int Three = Number3;
		 if (Number1 > Number3 && Number2 > Number3)  {
		 System.out.printf("Smallest is %d%n", Number3);
			}
		int Four = Number1;
		 if (Number2 < Number1 && Number3 < Number1)  {
		 System.out.printf("Largest is %d%n", Number1);
			}
		int Five = Number2;
		 if (Number1 < Number2 && Number3 < Number2)  {
		 System.out.printf("Largest is %d%n", Number2);
			}
		int Six = Number3;
		 if (Number1 < Number3 && Number2 < Number3)  {
		 System.out.printf("Largest is %d%n", Number3);
			}
	}
}