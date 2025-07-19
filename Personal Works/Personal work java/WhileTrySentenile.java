
import java.util.Scanner;
public class WhileTrySentenile{
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);

	int total = 0;
	int gradeCounter = 0;
	System.out.print("Enter Grade or -1 to Quit:");
 	int grade = input.nextInt();

	while (grade != -1) {
  		total += grade;
  		gradeCounter++;
		System.out.print("Enter Grade or -1 to Quit:");
  		grade = input.nextInt();
		}

		int average = total / gradeCounter ;
		System.out.printf("The Total =%d%n", total);
		System.out.printf("The Average =%d%n", average); 
	}

}