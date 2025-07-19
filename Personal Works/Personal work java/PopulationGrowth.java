public class PopulationGraowth {
 public static void main (String [] args) {

 long growth = 8_200_000_000_000L;
 double rate = 0.0085;

  long year1 = (long) (growth + (growth * rate));
  long year2 = (long)(year1 + (year1 * rate));
  long year3 = (long)(year2 + (year2 * rate));
  long year4 = (long)(year3 + (year3 * rate));
  long year5 = (long)(year4 + (year4 * rate));

   System.out.printf("Predicted Population Year 1 = %d%n", year1);
   System.out.printf("Predicted Population Year 2 = %df%n", year2);
   System.out.printf("Predicted Population Year 3 = %df%n", year3);
   System.out.printf("Predicted Population Year 4 = %df%n", year4);
   System.out.printf("Predicted Population Year 5 = %df%n", year5);
 
}

}