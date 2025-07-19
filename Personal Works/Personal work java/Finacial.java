/**(Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. (In Exercise 5.30, you will use a
loop to simplify the code and display the account value for any month.)
Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
Enter x1 and y1: 1.5 -3.4
Enter x2 and y2: 4 5
The distance between the two points is 8.764131445842194
Enter the monthly saving amount: 100
After the sixth month, the account value is $608.81 /*


public class Finacial {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter time :");
int month1 = input.nextInt();
 

}
}