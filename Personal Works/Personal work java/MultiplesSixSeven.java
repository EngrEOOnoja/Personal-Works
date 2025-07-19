import java.util.Scanner;

 public class MultiplesSixSeven {
  public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter Number : ");	
   int Number1 = input.nextInt();
    
   

    if (Number1 % 6 == 0 || Number1 % 7 == 0) {
     System.out.printf("The Number is a Multiple of Six or Seven ");
       }
      else  {
       System.out.printf("The Number is a not Multiple of Six or Seven"); 
        }
     

	}               
}