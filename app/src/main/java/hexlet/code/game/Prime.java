package hexlet.code.game;

import java.util.Random;

import static hexlet.code.game.GameSettings.PRIME_UPPER_BOUND;

public class Prime {
    private static String correctAnswer;

    public static String showQuestion(Random random) {
        int question = random.nextInt(PRIME_UPPER_BOUND) + 2;
        boolean isPrime = true;

        for (int i = question - 1; i > 1; i--) {
            if (question % i == 0) {
                isPrime = false;
                break;
            }
        }

        correctAnswer = isPrime ? "yes" : "no";
        System.out.println("Question: " + question);
        return correctAnswer;
    }

    public static boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }
}
