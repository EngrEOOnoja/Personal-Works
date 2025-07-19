import java.util.Scanner;
public class GradeCounter {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
int total = 0;
int gradeCounter = 1;

while (gradeCounter <= 10 ) {
      System.out.print("Enter grade");
       int grade  = input.nextInt();
       total = total + grade;
       gradeCounter = gradeCounter + 1; 
}
double average = total / 10;

 
System.out.printf("Total  is = : %d%n", total);
System.out.printf("Average is = : %.2f%n", average);
}
}