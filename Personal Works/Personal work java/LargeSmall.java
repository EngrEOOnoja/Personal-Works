import java.util.Scanner;
 
 public class LargeSmall {
  public static void main(String[] args) {
  
   Scanner input = new Scanner(System.in);
    
	System.out.print("Enter Integer");
	 int Number1 = input.nextInt();
	System.out.print("Enter Integer");
	 int Number2 = input.nextInt();
	System.out.print("Enter Integer");
	 int Number3 = input.nextInt();
	System.out.print("Enter Integer");
	 int Number4 = input.nextInt();
	System.out.print("Enter Integer");
	 int Number5 = input.nextInt();

	
	if (Number1 < Number2 && Number1 < Number3 && Number1 < Number4 && Number1 < Number5) {
	 System.out.printf("Smallest  is %d%n", Number1);
	}
	
	if (Number2 < Number1 && Number2 < Number3 && Number2 < Number4 && Number2 < Number5) {
	 System.out.printf("Smallest  is %d%n", Number2);
	}
	
	if (Number3 < Number2 && Number3 < Number1 && Number3 < Number4 && Number3 < Number5) {
	 System.out.printf("Smallest  is %d%n", Number3);
	}
	
	if (Number4 < Number2 && Number4 < Number3 && Number4 < Number3 && Number4 < Number5) {
	 System.out.printf("Smallest  is %d%n", Number4);
	}
	
	if (Number5 < Number2 && Number5 < Number1 && Number5 < Number4 && Number5 < Number3) {
	 System.out.printf("Smallest  is %d%n", Number5);
	}

	
	if (Number1 > Number2 && Number1 > Number3 && Number1 > Number4 && Number1 > Number5) {
	 System.out.printf("Largest  is %d%n", Number1);
	}
	
	if (Number2 > Number1 && Number2 > Number3 && Number2 > Number4 && Number2 > Number5) {
	 System.out.printf("Largest  is %d%n", Number2);
	}
	
	if (Number3 > Number2 && Number3 > Number1 && Number3 > Number4 && Number3 > Number5) {
	 System.out.printf("Largest  is %d%n", Number3);
	}
	
s	if (Number4 > Number2 && Number4 > Number3 && Number4 > Number3 && Number4 > Number5) {
	 System.out.printf("Largest  is %d%n", Number4);
	}
	
	if (Number5 > Number2 && Number5 > Number1 && Number5 > Number4 && Number5 > Number3) {
	 System.out.printf("Largest  is %d%n", Number5);
	}
	
	}
}