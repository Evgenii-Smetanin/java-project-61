package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

import static hexlet.code.Engine.ROUNDS;

public class Calculator {
    private static final String TASK = "What is the result of the expression?";
    private static final int CALCULATOR_UPPER_BOUND = 25;
    private static final int OPERATIONS = 3;

    private static final int SUM = 1;
    private static final int SUBSTRACT = 2;
    private static final int MULTIPLY = 3;

    public static void run() {
        String[][] questionsAnswers = new String[ROUNDS][2];

        for (int i = 0; i < questionsAnswers.length; i++) {
            int firstOperand = RandomUtils.generateNumber(1, CALCULATOR_UPPER_BOUND);
            int secondOperand = RandomUtils.generateNumber(1, CALCULATOR_UPPER_BOUND);
            int operationNum = RandomUtils.generateNumber(1, OPERATIONS);
            String operation;

            switch (operationNum) {
                case SUM:
                    operation = "+";
                    break;
                case SUBSTRACT:
                    operation = "-";
                    break;
                case MULTIPLY:
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
