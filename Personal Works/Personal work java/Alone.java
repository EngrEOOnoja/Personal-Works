import java.util.Scanner;

public class Alone {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter 1st Digit : ");
double Number1 = input.nextDouble();
System.out.print("Enter 2nd Digit : ");
double Number2 = input.nextDouble();
System.out.print("Enter 3rd Digit : ");
double Number3 = input.nextDouble();
System.out.print("Enter 4th Digit : ");
double Number4 = input.nextDouble();
System.out.print("Enter 5th Digit : ");
double Number5 = input.nextDouble();

double largest = Number1;
double secondlargest = -214597765;

if (Number2 > largest) largest = Number2;
if (Number3 > largest) largest = Number3;
if (Number4 > largest) largest = Number4;
if (Number5 > largest) largest = Number5;

if (Number2 < largest && Number2 > secondlargest) secondlargest = Number2;
if (Number3 < largest && Number3 > secondlargest) secondlargest = Number3;
if (Number4 < largest && Number4 > secondlargest) secondlargest = Number4;
if (Number5 < largest && Number5 > secondlargest) secondlargest = Number5;

System.out.printf("Largest is = : %1.2f%n", largest);
System.out.printf("SecondLargest is = : %1.2f%n", secondlargest);
  }
}