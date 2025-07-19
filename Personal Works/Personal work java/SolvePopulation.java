import java.util.Scanner;

public class SolvePopulation {
public static void main (String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the predicted growth time in years : ");
double year1 = input.nextDouble();
System.out.print("Enter the predicted growth time in years : ");
double year2 = input.nextDouble();
System.out.print("Enter the predicted growth time in years : ");
double year3 = input.nextDouble();
System.out.print("Enter the predicted growth time in years :  ");
double year4 = input.nextDouble();
System.out.print("Enter the predicted growth time in years :  ");
double year5 = input.nextDouble();

//P=P'*e^(rt).
//P = population at time t. P'=The initial population 8.2B . r = growth rate .85% .  t = the time in days (365).  e = natural log approximately = 2.72.

double P1 = 8200000000L * (Math.exp(0.0085*year1));
double P2 = 8200000000L * (Math.exp(0.0085*year2));
double P3 = 8200000000L * (Math.exp(0.0085*year3));
double P4 = 8200000000L * (Math.exp(0.0085*year4));
double P5 = 8200000000L * (Math.exp(0.0085*year5));

System.out.printf("Predicted Growth year1 = %1.2f%n", P1);
System.out.printf("Predicted Growth year2 = %1.2f%n", P2);
System.out.printf("Predicted Growth year3 = %1.2f%n", P3);
System.out.printf("Predicted Growth year4 = %1.2f%n", P4);
System.out.printf("Predicted Growth year5 = %1.2f%n", P5);

}
}