package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.game.GameSettings.PROGRESSION_LENGTH_UPPER_BOUND;
import static hexlet.code.game.GameSettings.PROGRESSION_MIN_LENGTH;
import static hexlet.code.game.GameSettings.PROGRESSION_START_NUMBER_BOUND;
import static hexlet.code.game.GameSettings.PROGRESSION_STEP_UPPER_BOUND;
import static hexlet.code.game.GameSettings.ROUNDS;

public class Progression {
    private static final String TASK = "What number is missing in the progression?";

    public static void run() {
        Random random = new Random();
        String[][] questionsAnswers = new String[ROUNDS][2];

        for (int i = 0; i < questionsAnswers.length; i++) {
            int length = random.nextInt(PROGRESSION_LENGTH_UPPER_BOUND) + PROGRESSION_MIN_LENGTH;
            int position = random.nextInt(length);
            int element = random.nextInt(PROGRESSION_START_NUMBER_BOUND);
            int step = random.nextInt(PROGRESSION_STEP_UPPER_BOUND) + 1;
            int correctAnswer = 0;

            StringBuilder sb = new StringBuilder("Question:");

            for (int j = 0; j < length; j++) {
                sb.append(" ");

                if (j > 0) {
                    element += step;
                }

                if (j == position) {
                    sb.append("..");
                    correctAnswer = element;
                } else {
                    sb.append(element);
                }
            }

            questionsAnswers[i][0] = sb.toString();
            questionsAnswers[i][1] = String.valueOf(correctAnswer);
        }

        Engine.run(TASK, questionsAnswers);
    }
}
