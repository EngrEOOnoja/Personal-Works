	public class NestedLoop2{
	public static void main (String [] args){
	
	
		
		for ( int number = 1; number < 7 ; number++ ){
		if(number <= 1)
			System.out.println(number + "  ");
		}
		for ( int number = 1; number < 3 ; number++ ){
		if(number <= 1)
			System.out.print(number + "  ");
		if (number == 2) System.out.println(number);	
		}
		for ( int number = 1; number < 4 ; number++ ){
		if(number <= 2)
			System.out.print(number + "  ");
		if (number == 3) System.out.println(number);			
		}
		for ( int number = 1; number < 5 ; number++ ){
		if(number <= 3)
			System.out.print(number + "  ");
		if (number == 4) System.out.println(number);			
		}
		for ( int number = 1; number < 6 ; number++ ){
		if(number <= 4)
			System.out.print(number + "  ");
		if (number == 5) System.out.println(number);			
		}
		for ( int number = 1; number < 7 ; number++ ){
		if(number <= 5)
			System.out.print(number + "  ");
		if (number == 6) System.out.println(number);			
		}
		
		
	
	}


}