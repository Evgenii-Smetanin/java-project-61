package hexlet.code.game;

import java.util.Random;

import static hexlet.code.game.GameSettings.PROGRESSION_LENGTH_UPPER_BOUND;
import static hexlet.code.game.GameSettings.PROGRESSION_START_NUMBER_BOUND;
import static hexlet.code.game.GameSettings.PROGRESSION_STEP_UPPER_BOUND;

public class Progression {
    private static int correctAnswer;

    public static String showQuestion(Random random) {
        int length = random.nextInt(PROGRESSION_LENGTH_UPPER_BOUND) + 5;
        int position = random.nextInt(length);
        int element = random.nextInt(PROGRESSION_START_NUMBER_BOUND);
        int step = random.nextInt(PROGRESSION_STEP_UPPER_BOUND) + 1;

        StringBuilder sb = new StringBuilder("Question:");

        for (int i = 0; i < length; i++) {
            sb.append(" ");

            if (i > 0) {
                element += step;
            }

            if (i == position) {
                sb.append("..");
                correctAnswer = element;
            } else {
                sb.append(element);
            }
        }

        System.out.println(sb.toString());
        return String.valueOf(correctAnswer);
    }

    public static boolean checkAnswer(String answer) {
        return Integer.parseInt(answer) == correctAnswer;
    }
}
