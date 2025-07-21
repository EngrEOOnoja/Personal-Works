import java.util.Scanner;
public class DriversMilelage{
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Distance in miles press -1 to Quit");
	int miles = input.nextInt();
	System.out.print("Enter Fuel Consumed in Gallon press -1 to Quit");
	int fuel = input.nextInt();


	int totalmileage = 0;

	
	while (miles != -1) {
	double mileage = (double) (miles / fuel);

	System.out.printf("Mileage in miles per gallon  is %.3f%n", mileage);
	totalmileage += mileage;

	System.out.print("Enter Distance in miles  press -1 to Quit");
	 miles =  input.nextInt();
	System.out.print("Enter Fuel Consumed in Gallon press -1 to Quit");
	 fuel =  input.nextInt();
			}
	double d = (double) totalmileage ;	
	System.out.printf("Total Mileage is %f%n ",d); 
}
}