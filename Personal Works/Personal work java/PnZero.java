import java.util.Scanner;
public class PnZero {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter Integer :");
	int number1 = input.nextInt();

	System.out.println("Enter Integer :");
	int number2 = input.nextInt();

	System.out.println("Enter Integer :");
	int number3 = input.nextInt();

	System.out.println("Enter Integer :");
	int number4 = input.nextInt();

	System.out.println("Enter Integer :");
	int number5 = input.nextInt();

	int positive = 0;
	int negative = 0;
	int zero = 0;
	
	if (number1 > 0){
 	positive++;
	}
	else if (number1 < 0) {
	negative ++;
	}
	else {zero ++;}
	
	if (number2 > 0){
 	positive++;
	}
	else if (number2 < 0) {
	negative ++;
	}
	else {zero ++;}

	if (number3 > 0){
 	positive++;
	}
	else if (number3 < 0) {
	negative ++;
	}
	else {zero ++;}

	if (number4 > 0){
 	positive++;
	}
	else if (number4 < 0) {
	negative ++;
	}
	else {zero ++;}

	if (number5 > 0){
 	positive++;
	}
	else if (number5 < 0) {
	negative ++;
	}
	else {zero ++;}

	System.out.printf("Positive Integer = %d%n ", positive);
	System.out.printf("Negative Integer = %d%n ", negative);
	System.out.printf("Zero Integer = %d%n ", zero);

	
}
}
