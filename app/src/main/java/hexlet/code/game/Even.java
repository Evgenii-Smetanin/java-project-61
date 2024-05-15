package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUNDS;

public class Even {
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int EVEN_UPPER_BOUND = 99;

    public static void run() {
        Random random = new Random();
        String[][] questionsAnswers = new String[ROUNDS][2];

        for (int i = 0; i < questionsAnswers.length; i++) {
            int question = random.nextInt(EVEN_UPPER_BOUND) + 1;

            questionsAnswers[i][0] = String.valueOf(question);
            questionsAnswers[i][1] = question % 2 == 0 ? "yes" : "no";
        }

        Engine.run(TASK, questionsAnswers);
    }
}
