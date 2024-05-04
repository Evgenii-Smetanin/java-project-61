package hexlet.code.game;

import java.util.Random;

import static hexlet.code.game.GameSettings.EVEN_UPPER_BOUND;

public class Even {
    private static String correctAnswer;

    public static String showQuestion(Random random) {
        int question = random.nextInt(EVEN_UPPER_BOUND) + 1;
        boolean isEven = question % 2 == 0;
        correctAnswer = isEven ? "yes" : "no";
        System.out.println("Question: " + question);
        return correctAnswer;
    }

    public static boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }
}
