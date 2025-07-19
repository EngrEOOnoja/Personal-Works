import java.util.Scanner;

public class BodyMass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter : weightInKilogram ");
        int number1 = scanner.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter : heightInMeters ");
        int number2 = scanner.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter : heightInMeters ");
        int number3 = scanner.nextInt();
        
        int bmi = ((number1) / (number2 * number2));
        System.out.println("BMI =" bmi);
            }
}