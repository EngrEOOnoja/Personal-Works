public calss ExamsCssj{
public static void main("""

	Cssj list of Department...!
	1. Science.
	2. Technical.
	3. Art.
	4. Social Science.
	5. Commercial.



	Thank you for checking our site.

""");

	Scanner input = new Scanner(System.in);
	int science = input.nrxtInt();
	switch(science){
		case 1:
	System.out.println("""
	 	1. Physics
		2. Chemistry.
		3. Biology.
		4. BioChemistry.
		5. Mathematics.
		6. Industrial Biology.
	""");
	int courses = input.nrxtInt();
	switch(courses){
		case 1:
	System.out.println("""
	1. metal
	2. magnet
	3. Steel.
	""");
	int physicscourses = input.nrxtInt();
	switch(physicscourses){
		case 1 :
	System.out.println("Metal Engineering");break;
		case 2 :
	System.out.println("Magnet Engineering");break;
		case 3 :
	System.out.println("Steel Engineering");break;
	}break;
	default : System.out.println("Enter a valid Option");

		case 2:
	System.out.println("");break;
		case 3:
	System.out.println("");break;
		case 4:
	System.out.println("");break;
		case 5:
	System.out.println("");break;

	}break;
	default : System.out.println("Enter a valid Option");

}
}