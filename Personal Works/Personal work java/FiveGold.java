import java.util.Scanner;
 public class FiveGold {
  public static void main (String [] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Enter 5 Gold :");
   int number1 = input.nextInt();
   
    int Gold1 = (number1 / 10000);
    int Gold2 = (number1 % 10000)/1000 ;
    int Gold3 = (number1 % 1000)/100;
    int Gold4 = (number1 % 100)/10;
    int Gold5 = (number1 % 10)/1;
 

  if (number1 < 10000 ) {
     System.out.println("Wrong, Enter FIve Digit");
     }
     if (number1 > 99999)  {
     System.out.println("Wrong, Enter FIve Digit");
     }
  if (number1 < 100000 && number1 > 10000) {

  System.out.println("Gold is =" + "  " + Gold1 + "   " + Gold2 + "   " + Gold3 + "   " + Gold4 + "   " + Gold5);
   }

    
  	}
}