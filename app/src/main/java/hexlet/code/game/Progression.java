package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUNDS;

public class Progression {
    private static final String TASK = "What number is missing in the progression?";
    private static final int PROGRESSION_START_NUMBER_BOUND = 30;
    private static final int PROGRESSION_STEP_UPPER_BOUND = 10;
    private static final int PROGRESSION_LENGTH_UPPER_BOUND = 6;
    private static final int PROGRESSION_MIN_LENGTH = 5;

    public static void run() {
        Random random = new Random();
        String[][] questionsAnswers = new String[ROUNDS][2];

        for (int i = 0; i < questionsAnswers.length; i++) {
            int length = random.nextInt(PROGRESSION_LENGTH_UPPER_BOUND) + PROGRESSION_MIN_LENGTH;
            int hiddenIndex = random.nextInt(length);
            int first = random.nextInt(PROGRESSION_START_NUMBER_BOUND);
            int step = random.nextInt(PROGRESSION_STEP_UPPER_BOUND) + 1;

            String[] progression = makeProgression(first, step, length);
            questionsAnswers[i][1] = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            questionsAnswers[i][0] = String.join(" ", progression);
        }

        Engine.run(TASK, questionsAnswers);
    }

    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        progression[0] = String.valueOf(first);

        for (int i = 1; i < length; i++) {
            progression[i] = String.valueOf(Integer.parseInt(progression[i - 1]) + step);
        }

        return progression;
    }
}
