import java.util.Scanner;
 
 public class LarSmaNumber {
  public static void main(String[] args) {
  
   Scanner input = new Scanner(System.in);
    
	System.out.print("Enter first Integer");
	 int Number1 = input.nextInt();
	System.out.print("Enter second Integer");
	 int Number2 = input.nextInt();
	System.out.print("Enter third Integer");
	 int Number3 = input.nextInt();
	System.out.print("Enter fourth Integer");
	 int Number4 = input.nextInt();
	System.out.print("Enter Fifth Integer");
	 int Number5 = input.nextInt();

	
	int Largest = Number1;
	int Smallest = Number1;
	
	if ( Number2 > Largest ) {
	Largest = Number2;
	}
	if ( Number3 > Largest ) {
	Largest = Number3;
	} 
	if ( Number4 > Largest ) {
	Largest = Number4;
	}
	if ( Number5 > Largest ) {
	Largest = Number5;
	}  

	
	if ( Number2 < Smallest ) {
	Smallest = Number2; 
	}
	if ( Number3 < Smallest ) {
	Smallest = Number3;
	}
	if ( Number4 < Smallest ) {
	Smallest = Number4;
	}
	if ( Number5 < Smallest ) {
	Smallest = Number5; 
	}

	System.out.println("Largest Is =" + " " + Largest);
        System.out.println("Smallest is =" + " " + Smallest);
	}
}