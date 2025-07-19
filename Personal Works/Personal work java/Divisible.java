import java.util.Scanner;

 public class Divisible {
  public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter interger: ");	
   int Number1 = input.nextInt();
  
    if ((Number1 % 3) == 0) {
     System.out.print("Number is divisible by three"); }

    if ((Number1 % 3) != 0) {
    System.out.print("Number is not divisible by three"); } 

	}
}