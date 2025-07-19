import java.util.*;
	public class Comparing{
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	   System.out.print("Enter first interger: ");
	   int Number1 = input.nextInt();
		int Sqr = (Number1 * Number1);
		 System.out.printf("Sqr is %d%n", Sqr);
		int Number2 = (100);
		 if (Number1 < Number2) {
		 System.out.printf("%d < %d%n", Number1, Number2);
		}
		 if (Sqr < Number2) {
		 System.out.printf("%d < %d%n", Sqr, Number2);
		}
		 if (Number1 == Number2) {
		 System.out.printf("%d == %d%n", Number1, Number2);
		}
		 if (Sqr == Number2) {
		 System.out.printf("%d == %d%n", Sqr, Number2);
		}
		 if (Number1 != Number2) {
		 System.out.printf("%d != %d%n", Number1, Number2);
		}
		 if (Sqr != Number2) {
		 System.out.printf("%d != %d%n", Sqr, Number2);
		}
		 if (Number1 > Number2) {
		 System.out.printf("%d > %d%n", Number1, Number2);
		}
		 if (Sqr > Number2) {
		 System.out.printf("%d > %d%n", Sqr, Number2);
		}

	}
}