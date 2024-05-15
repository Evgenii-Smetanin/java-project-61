package hexlet.code;

import java.util.Scanner;

import static java.lang.System.out;

public class Engine {
    public static final int ROUNDS = 3;
    private static String playerName;
    private static int round;
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
        round = 0;
    }

    public static void run(String task, String[][] questionsAnswers) {
        greet();
        out.println(task);
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

    public static void greet() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        playerName = sc.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }

    public static int getInt() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
            return getInt();
        }
    }
}
