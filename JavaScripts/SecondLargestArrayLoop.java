import java.util.Scanner;
public class ArrayClassModifyJS{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int[] myList = new int[6];

		
	int i = 1;
	int highest = myList[i];
	int secondLargest = 1;
	for(;i < myList.length;i++){
	System.out.println("Enter digit");
	myList[i] = input.nextInt();
	if (myList[i] > highest){ 
	highest = myList[i];}	
	if (myList[i] < highest && myList[i] > secondLargest){
	secondLargest = myList[i];}	
	}
	System.out.print("Highest is :" + highest);
	System.out.print("secondLargest " + secondLargest);





	}

} 