import java.util.Scanner;
public class NokiaPhone3310ForwardPrep {
public static void main (String[] args){

mainMenu();
}

public static void mainMenu(){

	System.out.println( """

	Welcome to your Nokia Phone.
	

	List of menu Functions.
	
	1. PhoneBook.
	2. Messages.
	3. Chat.
	4. Call Register.
	5. Tones.
	6. Settings.
`	7. Call Dirvert.
	8. Games.
	9. Calculator.
	10. Reminder.
	11. Clock.
	12. Profiles.
	13. Sim Service.
	14.


	0. Exit.
	""");  
	
	Scanner input = new Scanner(System.in);
	int phoneBook = input.nextInt();
	switch(phoneBook){
		case 1: phoneBook();
			
		}
}

		public static void getPhone(String phone){
		Scanner input = new Scanner(System.in);
		System.out.print(phone);
		int phone = input.nextInt();
		}
		
		public static void phoneBook(){
		System.out.println("""
		1 : Search 
		2 : Service Number
		3 : Add Name
		4 : Erase
		5 : Edit
		6 : Assign tone
		7 : Send Bcard
       		8 : Options
		9 : Speed dails
		10 : Voice tags 
		0: Exit
		""");
		
		}

		Scanner input = new Scanner(System.in);
		int phoneBook = input.nextInt();
		switch(phoneBook){
		case 1: gotopook("Seacrh");
		}
		
		public static void 
		
}