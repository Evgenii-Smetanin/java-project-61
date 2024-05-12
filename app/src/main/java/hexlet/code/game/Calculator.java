package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.game.GameSettings.CALCULATOR_UPPER_BOUND;
import static hexlet.code.game.GameSettings.ROUNDS;

public class Calculator {
    private static final String TASK = "What is the result of the expression?";
    private static final int OPERATIONS = 3;

    public static void run() {
        Random random = new Random();
        String[][] questionsAnswers = new String[ROUNDS][2];

        for (int i = 0; i < questionsAnswers.length; i++) {
            int firstOperand = random.nextInt(CALCULATOR_UPPER_BOUND) + 1;
            int secondOperand = random.nextInt(CALCULATOR_UPPER_BOUND) + 1;
            String operation = "";
            int correctAnswer = 0;

            switch (random.nextInt(OPERATIONS)) {
                case 0:
                    operation = "+";
                    correctAnswer = firstOperand + secondOperand;
                    break;
                case 1:
                    operation = "-";
                    correctAnswer = firstOperand - secondOperand;
                    break;
                case 2:
                    operation = "*";
                    correctAnswer = firstOperand * secondOperand;
                    break;
                default:
                    break;
            }

            questionsAnswers[i][0] = firstOperand + " " + operation + " " + secondOperand;
            questionsAnswers[i][1] = String.valueOf(correctAnswer);
        }

        Engine.run(TASK, questionsAnswers);
    }
}
