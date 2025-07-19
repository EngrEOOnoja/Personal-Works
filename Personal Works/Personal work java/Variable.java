//collect five input and find their averages, the input should be collectd as int and the average should be calculated as double

import java.util.Scanner;
 public class Input {
 public static void main {
 Scanner input = new scanner(System.in);
 System.out.print("Enter  digit:");
 int number1 =input.nextInt();
 System.out.print("Enter  digit:");
 int number2 =input.nextInt();
 System.out.print("Enter  digit:");
 int number3 =input.nextInt();
 System.out.print("Enter  digit:");
 int number4 =input.nextInt();
 System.out.print("Enter  digit:");
 int number5 =input.nextInt();

double average = ((number1 + number2 + number3 + number4 + number5)/5);
average = average % 100;

System.out.print("Average is ", + " " average);
 
}
}