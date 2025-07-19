import java.util.Scanner;
public class LargestSmallestLoop{
public static void main (String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter Digit or -1 to exit");
int digit = input.nextInt();

int largest = digit;
int smallest = digit;

	while(digit != -1){
	System.out.println("Enter Digit or -1 to exit");
	digit = input.nextInt();
	if (digit < smallest){
	smallest = digit;}
	if(digit > largest) { 
	largest = digit;	
	}
	}

	System.out.println("Largest is : " + largest);
	System.out.println("Smallest is : " + smallest);
	
	}
}















	/**while(largest != -1){
	System.out.println("Enter Digit");
	digit = input.nextInt();

	if (digit == -1)
	 {if (largest > digit) 
	largest = digit;
	if (digit < smallest)
	smallest = digit;
	System.out.println("The Largest Number is : " + largest);
	System.out.println("The smallest Number is : " + smallest);}*/