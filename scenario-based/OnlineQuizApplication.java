import java.util.Scanner;

public class OnlineQuizApplication{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Questions array
        String[] questions = {
            "1. Which of the following is not a Java feature?",
            "2. What is the default value of a boolean variable in Java?",
            "3. Which keyword is used to prevent a method from being overridden?",
            "4. Where are local variables and parameters stored whenever a method is invoked?",
            "5. Which of these is the correct way to find the length of an array named arr?"
        };

        // Options array
        String[][] options = {
            {"A. OOPM", "B. Secure", "C. Use of pointers", "D. Easy to use"},
            {"A. true", "B. 0", "C. false", "D. null"},
            {"A. final", "B. this", "C. void", "D. static"},
            {"A. Heap", "B. Stack", "C. Array", "D. Tree"},
            {"A. arr.getSize()", "B. arr.length()", "C. arr.size()", "D. arr.length"}
        };

        // Correct answers
        char[] answers = {'C', 'C', 'A', 'B', 'D'};

        int score = 0;

        // Quiz loop
        for (int i=0; i<questions.length;i++) {

            System.out.println("\n" + questions[i]);

            for (int j=0; j<options[i].length;j++){
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            // Switch case for answer checking
            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Wrong! Correct answer is: " + answers[i]);
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        // Final Score
        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: "+ score+ " / " +questions.length);
    }
}
