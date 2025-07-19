import java.util.Scanner;
public class WhileTry{
public static void main (String[] args) {
Scanner input = new Scanner(System.in);

int total = 0;
int gradeCounter = 1;

while (gradeCounter <= 10) {
  System.out.print("Enter Grade :");
 int grade = input.nextInt();
  total += grade;
  gradeCounter++;
}
int average = total / 10 ;
System.out.printf("The Total =%d%n", total);
System.out.printf("The Average =%d%n", average); 
}
}