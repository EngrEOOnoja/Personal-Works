import java.util.Scanner;

 public class Multiples {
  public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter interger One : ");	
   int Number1 = input.nextInt();
    System.out.print("Enter interger Two: ");	
   int Number2 = input.nextInt();
   
   int Number3 = (Number1 * Number1 * Number1);
   int Number4 = (Number2 * Number2);	


    if ((Number4 % Number3) == 0) {
     System.out.print(Number4 + " " + "is a multiple of" + " " + Number3); }

    if ((Number4 % Number3) != 0) {
    System.out.println(Number4 + " " + "is not a multiple of " + " " + Number3); } 

	}
}