import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();

        if (Scanner scanner = new Scanner(> 5 digit);
         System.out.print("sorry input % digit");
        if (Scanner scanner = new Scanner(< 5 digit);
         System.out.print("sorry input % digit");
       
       
        int digit1 = number / 10000;
        int digit2 = (number % 10000) / 1000;
        int digit3 = (number % 1000) / 100;
        int digit4 = (number % 100) / 10;
        int digit5 = number % 10;

        System.out.println(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5);
    }
}