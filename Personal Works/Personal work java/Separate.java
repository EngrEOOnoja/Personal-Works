import java.util.Scanner;
	public class Separate{
	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	   System.out.print("Enter five digits: ");
	   int Number = input.nextInt();

	   int Number1 = (Number/10000);
	   int Number2 = (Number%10000)/1000;
	   int Number3 = (Number%1000)/100;
	   int Number4 = (Number%100)/10;
	   int Number5 = (Number%10);
	   System.out.println (Number1 + "   " + Number2 + "   " +  Number3 + "   " + Number4 + "   " +  Number5);	
	}
}