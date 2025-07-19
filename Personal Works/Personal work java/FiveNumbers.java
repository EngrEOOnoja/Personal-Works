import java.util.Scanner;

 public class FiveNumbers {
  public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter interger: ");	
   int Number1 = input.nextInt();
   int Number2 = input.nextInt();
   int Number3 = input.nextInt();
   int Number4 = input.nextInt();
   int Number5 = input.nextInt();

    int positiveDigit = 0;
    int negativeDigit = 0;
    int zeroDigit = 0;

  
    if (Number1 > 0) { 
     positiveDigit = positiveDigit + 1;
    }

    if (Number1 < 0) {
     negativeDigit = negativeDigit + 1;
    }

     if (Number1 == 0) {
     zeroDigit = zeroDigit + 1;
    }     

     if (Number2 > 0) {
     positiveDigit = positiveDigit + 1;
    }

    if (Number2 < 0) {
     negativeDigit = negativeDigit + 1;
    }

     if (Number2 == 0) {
     zeroDigit = zeroDigit + 1;
    }    

     if (Number3 > 0) {
     positiveDigit = positiveDigit + 1;
    }

    if (Number3 < 0) {
     negativeDigit = negativeDigit + 1;
    }

     if (Number3 == 0) {
     zeroDigit = zeroDigit + 1;
    }     

     if (Number4 > 0) {
     positiveDigit = positiveDigit + 1;
    }

    if (Number4 < 0) {
     negativeDigit = negativeDigit + 1;
    }

     if (Number4 == 0) {
     zeroDigit = zeroDigit + 1;
    }     

     if (Number5 > 0) {
     positiveDigit = positiveDigit + 1;
    }

    if (Number5 < 0) {
     negativeDigit = negativeDigit + 1;
    }

     if (Number5 == 0) {
     zeroDigit = zeroDigit + 1; 
    }


    System.out.println ("First digit =" + Number1);
    System.out.println ("Second digit =" + Number2);
    System.out.println ("Third digit =" + Number3);
    System.out.println ("forth digit =" + Number4);
    System.out.println ("Fifty digit =" + Number5);
    System.out.println ("Positive Number =" + positiveDigit);
    System.out.println ("negative Number =" + negativeDigit);
    System.out.println ("zero Number =" + zeroDigit);


	}
}