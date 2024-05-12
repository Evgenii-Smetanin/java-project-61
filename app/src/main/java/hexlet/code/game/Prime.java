package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.game.GameSettings.PRIME_UPPER_BOUND;
import static hexlet.code.game.GameSettings.ROUNDS;

public class Prime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        Random random = new Random();
        String[][] questionsAnswers = new String[ROUNDS][2];

        for (int i = 0; i < questionsAnswers.length; i++) {
            int question = random.nextInt(PRIME_UPPER_BOUND) + 2;
            boolean isPrime = true;

            for (int j = question - 1; j > 1; j--) {
                if (question % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            questionsAnswers[i][0] = String.valueOf(question);
            questionsAnswers[i][1] = isPrime ? "yes" : "no";
        }

        Engine.run(TASK, questionsAnswers);
    }
}
