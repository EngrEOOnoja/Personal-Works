import java.util.Scanner;
public class PasswordStrength1 {
public static void main(String [] args){
	main();
}

public static String getPassword(){
	Scanner input = new Scanner(System.in);
	System.out.println("Suggest a Strong Password :");
	String password = input.next();
	return password;
} 

public static int[] checkComplexity(String password){
	int digitCounter = 0;
	int letterCounter = 0;
	int index = 0;
	while (index < password.length()){
	if(Character.isDigit(password.charAt(index))){ 
	digitCounter += 1;}
	else{ letterCounter += 1; }
	index++;
	}
	System.out.println("The letter are :" + letterCounter + "\nThe numbers of digits are : "  + digitCounter );
	return new int [] {digitCounter, letterCounter};
	
	}

public static String evaluateStrength(int digitCounter, int letterCounter){
	if (letterCounter >= 8 && digitCounter >= 2){
	return "Strong .";
	}
	else if (letterCounter >= 5 && digitCounter >= 1){
	return "Moderate . Enter atleast 8 letters and 2 digits.";
	}
	else {
	return "Weak . Enter atleast 8 letters and 2 digits.";
	}

}

public static void main(){
Scanner input = new Scanner(System.in);
boolean secure = true;

	while(secure){
		String userPassword = getPassword();
		System.out.println("Your Password is : " + userPassword);
		int[] complexity = checkComplexity(userPassword);
		String strenght = evaluateStrength(complexity[0], complexity[1]);
		System.out.println("The Strength of Your password is :" + strenght);
		System.out.println("Do you want to Try Again");
		String validation = input.nextLine().toLowerCase();
		if (validation.equals("no")){
		break;}
}

}

}

