import java.util.Scanner;
	public class Circle {
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	   System.out.print("Enter Radius: ");
	   double Radius = input.nextInt();
	 
		double Diameter = (2 * Radius);
		 System.out.println("Diameter is :" + " " + Diameter);
		double Circumfrence = (2 * Math.PI * Radius);
		 System.out.println("Circumfrence is :" + " " + Circumfrence);
		double Area = (Math.PI * Radius * Radius );
		 System.out.println("Area is :" + " " + Area);

		
	}
}