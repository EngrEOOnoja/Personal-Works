import java.util.Scanner;
public class NokiaPhone3310ForwardBackward {
public static void main (String[] args){

Scanner input = new Scanner(System.in);
boolean function = true;

/**int phonebook;
int option;
int message;
int messagesettings;
int set1;
int common;
int callregister;
int showcallduration;
int showcallcost;
int costsettings;
int tones;
int settings;
int callsetting;
int phonesettings;
int security;
int clock*/



	while(function){
		System.out.println( """

	Welcome to your Nokia Phone.
	

	List of menu Functions.
	
	choose one of the options..!
	
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

	00. Exit.		
	""");  

	int phonebooklist = input.nextInt();
	switch(phonebooklist){
	case 1 :

	boolean phonebook = true; 
	while (phonebook){
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
	00 : Exit
	77 : Go back to Menu function.
	99 : Previous.
	""");
	
	int search = input.nextInt();
	switch(search) {
	case 1 : 
	System.out.println("Search");break;

	case 2 :
	System.out.println("Service Number");
	 break;
	
	case 3 :
	System.out.println("Add Name");
	 break;

	case 4 :
	System.out.println("Erase");
	 break;

	case 5 :
	System.out.println("Edit");
	 break;

	case 6 :
	System.out.println("Assign tone");
	 break;
	
	case 7 :
	System.out.println("Send Bcard");
	 break;

	case 8 :
	System.out.println("""
	 1:Type of view
	 2: Memory status
	00 : Exit
	77 : Go back to Menu function.
	99 : Previous.
	""");

	int type = input.nextInt();
	switch(type){
		case 1:
	System.out.println("Type of view");break;
		case 2:
	System.out.println("Memory status");break;
	}break;
	default : System.out.println("Enter Correct Input");
	

	case 9 :
	System.out.println("Speed Dial");
	 break;
	case 10 :
	System.out.println("Voice tags");}
	 break;
	default : System.out.println("Enter Correct Input");}
	}



	
	
		case 2 :
	System.out.println("""
	1.write messages
	2. inbox.
	3. outbox.
	4. picture messages
	5. Templates.
	6. Smileys.
	7. Message Settings
	8. info service
	9. Voice mailbox number
	10. Service command editor
	00 : Exit
	77 : Go back to Menu function.
	99 : Previous.	
	""");

	int messagesetting = input.nextInt();
	switch(messagesetting){
	
		case 1: 
	System.out.println("Write message");break;
		case 2:
	System.out.println("Indox");break;
		case 3:
	System.out.println("Outbox");break;
		case 4:
	System.out.println("Picture mressages");break;
		case 5 :
	System.out.println("Templates");break;
		case 6 :
	System.out.println("Smileys");break;
		case 7 :
	System.out.println(""" 
	   1 : set1
	   2 : common
	   00 : Exit
	   77 : Go back to Menu function.
	   99 : Previous.	

	 """); 

 	int setting = input.nextInt();
	switch(setting) {
	 	case 1 :
	System.out.println(""" 
		1 : Message centre number
		2 : Message sent as
		3 : Message validity
		00 : Exit
		77 : Go back to Menu function.
		99 : Previous.	

		""");
	int messagecentre = input.nextInt();
	switch(messagecentre){
		case 1:
	System.out.println("Message centre number");break; 
		case 2:
	System.out.println("Message sent as");break;
		case 3:
	System.out.println("Message centre number");break;
	}

		case 2 :
	System.out.println(""" 
		 1 : Delivery reports
		 2 : Reply via same centre
		 3 : Character support
		 00 : Exit
		 77 : Go back to Menu function.
		 99 : Previous.	

		"""); 
		int deliveryreport = input.nextInt();
		switch(deliveryreport){
		case 1:
		System.out.println("Delivery reports");break;
		case 2 :
		System.out.println("Reply via same centre");break;
		case 3 :
		System.out.println("Character support");}break;
	 }default : System.out.println("Enter Correct Input");
	}break;

		case 3: 
	System.out.println("Chat"); 
	break;
	
	case 4 : 
	System.out.println("""
		1. Missed calls
		2. Receicved calls
		3. Dialled numbers
		4. Erased recent call lists
		5. Show call duration
		6. Show call cost
		7. Call cost settings
		8. Prepaid credit
		00 : Exit
		77 : Go back to Menu function.
		99 : Previous.	

		""");

		int showCall = input.nextInt();
		switch(showCall) {
			case 5 :
		System.out.println("""
		  1. Last call duration
		  2. All calls duration
		  3. Received calls duration
		  4. Dialled calls duration
		  5. Clear timers
		  00 : Exit
		  77 : Go back to Menu function.
		  99 : Previous.	

		"""); break;
			case 6 :
		  System.out.println("""
		  1. Last call costs
		  2. All calls duration
		  3. Clear counters
		  00 : Exit
		  77 : Go back to Menu function.
		  99 : Previous.	

			""");break;
			case 7 :
		System.out.println("""
		  1. Call cost limit
		  2. Show costs in
		  00 : Exit
		  77 : Go back to Menu function.
		  99 : Previous.	
	
		""");
	default : System.out.println("Enter Correct Input");
	} break;

	case 5 :
	System.out.println("""
	1. Ringing tone
	2. Ringing volume
	3. Incoming call alert
	4. Composer
	5. Message alert tone
	6. Keypad tones
	7. Warning and game tones
	8. Vibrating alert
	9. Screen saver 
	00 : Exit
	77 : Go back to Menu function.
	99 : Previous.	

	"""); 	
	int ringSetting = input.nextInt();
		switch(ringSetting) {
		case 1:
	System.out.println("Ringing tone");break;
		case 2:
	System.out.println("Ringing volume");break;
		case 3:
	System.out.println("Incoming call alert");break;
		case 4:
	System.out.println("Composer");break;
		case 5:
	System.out.println("Message alert tones");break;
		case 6:
	System.out.println("Keypad tones");break;
		case 7:
	System.out.println("Warning and game tones");break;
		case 8:
	System.out.println("Vibrating alert");break;
		case 9:
	System.out.println("Screen saver");break;
	default : System.out.println("Enter Correct Input");
	}break;

	case 6 :
	System.out.println("""
	1. Call settings
	2. Phone settings
	3. Security settings 
	4. Restory factory 
	00 : Exit
	77 : Go back to Menu function.
	99 : Previous.	

	""");
	int setting = input.nextInt();
		switch(setting) {
		case 1 :
	System.out.println("""
	1. Automatic redial
	2. Speed dialing
	3. Call waiting options
	4. Own number sending
	5. Phone line in use
	6. Automatic answer
	00 : Exit
	77 : Go back to Menu function.
	99 : Previous.	
 
	"""); 
	int automaticredail = input.nextInt();
	switch(automaticredail) {
		case 1 :
	System.out.println("Automatic redail");break;
		case 2 :
	System.out.println("Speed dialing");break;
		case 3 :
	System.out.println("Call waiting options");break;
		case 4 :
	System.out.println("Own number sending");break;
		case 5 :
	System.out.println("Phone line in use");break;
		case 6 :
	System.out.println("Automatic answer");break;
	default : System.out.println("Enter Correct Input");
	}break;

		case 2 :
	System.out.println("""
	1. Language 
	2. Cell info display
	3. Welcome note
	4. Network selection
	5. Lights
	6. Confirm SIM service actions
	00 : Exit
	77 : Go back to Menu function.
	99 : Previous.	

	""");
	int language = input.nextInt();
	switch(language) {
		case 1:
	System.out.println("Language");break;	
		case 2:
	System.out.println("Cell info display");break;
		case 3:
	System.out.println("Welcome note");break;	
		case 4:
	System.out.println("Network selection");break;	
		case 5:
	System.out.println("Lights");break;	
		case 6:
	System.out.println("Confirm SIM service actions");break;	
	default : System.out.println("Enter Correct Input");
	}break;
		case 3:
	System.out.println("""
	1. PIN code request 
	2. Call barring service
	3. Fixed dialling
	4. Closed user group
	5. Phone security
	6. Change access codes
	00 : Exit
	77 : Go back to Menu function.
	99 : Previous.	

	""");
	int pin = input.nextInt();
	switch (pin){
		case 1:
	System.out.println("PIN code request");break;
		case 2:
	System.out.println("Call barring service");break;
		case 3:
	System.out.println(" Fixed dialling");break;
		case 4:
	System.out.println("Closed user group");break;
		case 5:
	System.out.println("Phone security ");break;
		case 6:
	System.out.println("Change access codes");break;
	default : System.out.println("Enter Correct Input");
		}break;

		case 4:
	System.out.println(""" 
		1. Restory factory
		00 . Exit
		77 . Go back to Menu function
		99 . Previous
	""");
		} break;
	
		case 7: 
	System.out.println("Call divert"); 
	break;


	case 8: 
	System.out.println("Games"); 
	break;

	case 9: 
	System.out.println("Calculator"); 
	break;

	case 10: 
	System.out.println("Reminders"); 
	break;


	case 11 :
	System.out.println("""
	1. Alarm clock
	2. Clock settings
	3. Date setting
	4. Stopwatch
	5. Countdown timer
	6. Autp update of date and times
	00 : Exit
	77 : Go back to Menu function.
	99 : Previous.	
	""");
		
	int eleven = input.nextInt();
	switch (eleven) {
	case 1 :
	System.out.println("Alarm");break;
	case 2 :
	System.out.println("Clcok Settings");break;
	case 3 :
	System.out.println("Date Settings");break;
	case 4 :
	System.out.println("Stop Watch");break;
	case 5 :
	System.out.println("Count Down Timer");break;
	case 6 :
	System.out.println("Auto update of date and time");
	default : System.out.println("Enter Correct Input");
	}break;
	
	
 	case 12: 
	System.out.println("""
	1. Profiles
	00 : Exit
	77 : Go back to Menu function.
	99 : Previous.	
	"""); 
	
	int profile = input.nextInt();
	switch (profile) {
		
		case 1:
	System.out.println("");
		case 00 :
	System.out.println("");

	        case 77 :
	System.out.println("");
		case 99 :
	System.out.println("");}


	case 13: 
	System.out.println("""
	1. SIM services
	00 : Exit
	77 : Go back to Menu function.
	99 : Previous.	

	"""); 
	break;


		case 00 :
	System.out.println("Thank you for choosing Nokia");
	function = false;
	break;	
	default : System.out.println("Enter Correct Input");

	
	}

}	
	
	}
}

}