import java.util.Scanner;
public class Ope {
 public static void main (String[] args) {
  Scanner name = new Scanner(System.in);
  System.out.print("Enter First Interger :");
  int number1 = name.nextInt();
  System.out.print("Enter Second Interger :");
  int number2 = name.nextInt();
  System.out.print("Enter Third Interger :");
  int number3 = name.nextInt();
  
  double average = (number1 +number2 + number3)/3;
 
  System.out.printf("Average of the Three digit : = %1.2f", average);
   
}
}