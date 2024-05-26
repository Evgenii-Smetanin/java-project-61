package hexlet.code;

import java.util.Scanner;

import static java.lang.System.out;

public class Engine {
    public static final int ROUNDS = 3;

    public static void run(String task, String[][] questionsAnswers) {
        Scanner sc = new Scanner(System.in);
        out.println("Welcome to the Brain Games!\nMay I have your name?");
        String playerName = sc.nextLine();
        out.println("Hello, " + playerName + "!\n" + task);

        for (String[] questionAnswer : questionsAnswers) {
            out.println("Question: " + questionAnswer[0]);
            String answer = sc.nextLine();
            out.println("Your answer: " + answer);

            if (answer.equals(questionAnswer[1])) {
                out.println("Correct!");
            } else {
                out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + questionAnswer[1]
                        + "'.\nLet's try again, " + playerName + "!");
                return;
            }
        }

        out.println("Congratulations, " + playerName + "!");
    }
}
