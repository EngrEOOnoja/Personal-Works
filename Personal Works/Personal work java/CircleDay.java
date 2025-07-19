import java.util.Scanner;
	public class CircleDay {
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	   System.out.print("Enter Radius: ");
	   double Radius = input.nextInt();
	 
		 System.out.printf("Diameter is : %.2f%n", 2 * Radius);
		 System.out.printf("Circumfrence is : %.2f&n",   2 * Math.PI * Radius);
		 System.out.printf("Area is : %.2f%n",  Math.PI * Radius * Radius);

		
	}
}