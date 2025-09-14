import java.util.Scanner;

public class MBTI {
    public static String[] questions = {
        "At a party do you:",
        "Are you more:",
        "Is it worse to:",
        "Are you more impressed by:",
        "At a party do you:",
        "Are you more:",
        "Is it worse to:",
        "Are you more impressed by:",
        "At a party do you:",
        "Are you more:",
        "Is it worse to:",
        "Are you more impressed by:",
        "At a party do you:",
        "Are you more:",
        "Is it worse to:",
        "Are you more impressed by:",
        "At a party do you:",
        "Are you more:",
        "Is it worse to:",
        "Are you more impressed by:"
    };

    public static String[][] options = {
        {"Interact with many including strangers", "Interact with a few known to you"},
        {"Realistic than speculative", "Speculative than realistic"},
        {"Have your head in the clouds", "Be in a rut"},
        {"Principles", "Emotions"},
        {"Stay late with increasing energy", "Leave early with decreased energy"},
        {"Sensible people", "Imaginative people"},
        {"What is actual", "What is possible"},
        {"Laws than circumstances", "Circumstances than laws"},
        {"Objective", "Personal"},
        {"Punctual", "Leisurely"},
        {"Incomplete", "Completed"},
        {"Keep abreast of other’s happenings", "Get behind on the news"},
        {"Do it the usual way", "Do it your own way"},
        {"Say what they mean and mean what they say", "Express things more by use of analogy"},
        {"Consistency of thought", "Harmonious human relationships"},
        {"Logical judgments", "Value judgments"},
        {"Settled and decided", "Unsettled and undecided"},
        {"Stay late with increasing energy", "Leave early with decreased energy"},
        {"Sensible people", "Imaginative people"},
        {"What is actual", "What is possible"}
    };

    public static void main(String[] args) {
        getPersonalityType();
    }

    public static void getPersonalityType() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        int e = 0, i = 0, s = 0, n = 0, t = 0, f = 0, j = 0, p = 0;
        String[] answers = new String[20];

        for (int index = 0; index < questions.length; index++) {
            System.out.println("\n" + (index + 1) + ". " + questions[index]);
            System.out.println("A: " + options[index][0]);
            System.out.println("B: " + options[index][1]);
            System.out.print("Enter your answer (A/B): ");
            String answer = scanner.nextLine().toUpperCase();
            while (!answer.equals("A") && !answer.equals("B")) {
                System.out.print("Invalid input. Please enter A or B: ");
                answer = scanner.nextLine().toUpperCase();
            }

            answers[index] = answer.equals("A") ? options[index][0] : options[index][1];

            int questNum = index + 1;
            if (questNum == 1 || questNum == 5 || questNum == 9 || questNum == 13 || questNum == 17) {
                if (answer.equals("A")) e++; else i++;
            } else if (questNum == 2 || questNum == 6 || questNum == 10 || questNum == 14 || questNum == 18) {
                if (answer.equals("A")) s++; else n++;
            } else if (questNum == 3 || questNum == 7 || questNum == 11 || questNum == 15 || questNum == 19) {
                if (answer.equals("A")) t++; else f++;
            } else if (questNum == 4 || questNum == 8 || questNum == 12 || questNum == 16 || questNum == 20) {
                if (answer.equals("A")) j++; else p++;
            }
        }

        String result = "";
        result += e >= i ? "E" : "I";
        result += s >= n ? "S" : "N";
        result += t >= f ? "T" : "F";
        result += j >= p ? "J" : "P";

        System.out.println("\n" + userName);
        System.out.println("Your MBTI personality type is: " + result);
        System.out.println("\nYour Answers are:");
             
          for (int index = 0; index < questions.length; index++) {
    System.out.println((index + 1) + ". " + questions[i]);
    System.out.println("  You answered : " + answers[index]);
}

        }
        
        
        }
     
        
