package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int ROUNDS = 3;
    private static final int PRIME_UPPER_BOUND = 99;

    public static void run() {
        Random random = new Random();
        String[][] questionsAnswers = new String[ROUNDS][2];

        for (int i = 0; i < questionsAnswers.length; i++) {
            int question = random.nextInt(PRIME_UPPER_BOUND) + 2;
            questionsAnswers[i][0] = String.valueOf(question);
            questionsAnswers[i][1] = checkNumberIsPrime(question) ? "yes" : "no";
        }

        Engine.run(TASK, questionsAnswers);
    }

    private static boolean checkNumberIsPrime(int number) {
        for (int j = number - 1; j > 1; j--) {
            if (number % j == 0) {
                return false;
            }
        }

        return true;
    }
}
