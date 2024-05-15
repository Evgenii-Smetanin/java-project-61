package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUNDS;

public class Calculator {
    private static final String TASK = "What is the result of the expression?";
    private static final int CALCULATOR_UPPER_BOUND = 25;
    private static final int OPERATIONS = 3;

    public static void run() {
        Random random = new Random();
        String[][] questionsAnswers = new String[ROUNDS][2];

        for (int i = 0; i < questionsAnswers.length; i++) {
            int firstOperand = random.nextInt(CALCULATOR_UPPER_BOUND) + 1;
            int secondOperand = random.nextInt(CALCULATOR_UPPER_BOUND) + 1;
            int operationNum = random.nextInt(OPERATIONS);
            String operation;

            switch (operationNum) {
                case 0:
                    operation = "+";
                    break;
                case 1:
                    operation = "-";
                    break;
                case 2:
                    operation = "*";
                    break;
                default:
                    throw new IllegalArgumentException("Illegal operation number: '" + operationNum
                            + "', Operation must be between 0-2 inclusive");
            }

            questionsAnswers[i][0] = firstOperand + " " + operation + " " + secondOperand;
            questionsAnswers[i][1] = String.valueOf(calculateExpressionResult(firstOperand, secondOperand, operation));
        }

        Engine.run(TASK, questionsAnswers);
    }

    private static int calculateExpressionResult(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                throw new IllegalArgumentException("Illegal operation: '" + operation
                        + "', Operation must equal '+', '-' or '*'");
        }
    }
}
