package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

import static hexlet.code.Engine.ROUNDS;

public class GCD {
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    private static final int GCD_UPPER_BOUND = 99;

    public static void run() {
        String[][] questionsAnswers = new String[ROUNDS][2];

        for (int i = 0; i < questionsAnswers.length; i++) {
            int firstOperand = RandomUtils.generateNumber(1, GCD_UPPER_BOUND);
            int secondOperand = RandomUtils.generateNumber(1, GCD_UPPER_BOUND);
            int correctAnswer = firstOperand > secondOperand
                    ? gcdByEuclidsAlgorithm(firstOperand, secondOperand)
                    : gcdByEuclidsAlgorithm(secondOperand, firstOperand);

            questionsAnswers[i][0] = firstOperand + " " + secondOperand;
            questionsAnswers[i][1] = String.valueOf(correctAnswer);
        }

        Engine.run(TASK, questionsAnswers);
    }

    private static int gcdByEuclidsAlgorithm(int firstOperand, int secondOperand) {
        if (secondOperand == 0) {
            return firstOperand;
        }
        return gcdByEuclidsAlgorithm(secondOperand, firstOperand % secondOperand);
    }
}
