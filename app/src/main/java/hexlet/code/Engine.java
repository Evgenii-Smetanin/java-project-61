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
        int round = 0;

        while (round < ROUNDS) {
            out.println("Question: " + questionsAnswers[round][0]);
            String answer = sc.nextLine();
            out.println("Your answer: " + answer);

            if (answer.equals(questionsAnswers[round][1])) {
                out.println("Correct!");
                round++;

                if (round == ROUNDS) {
                    out.println("Congratulations, " + playerName + "!");
                }
            } else {
                out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + questionsAnswers[round][1]
                        + "'.\nLet's try again, " + playerName + "!");
                break;
            }
        }
    }
}
