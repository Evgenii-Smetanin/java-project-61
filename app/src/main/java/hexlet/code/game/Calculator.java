package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

import static hexlet.code.Engine.ROUNDS;

public class Calculator {
    private static final String TASK = "What is the result of the expression?";
    private static final int CALCULATOR_UPPER_BOUND = 25;
    private static final int OPERATIONS_MAX_INDEX = 2;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void run() {
        String[][] questionsAnswers = new String[ROUNDS][2];

        for (int i = 0; i < questionsAnswers.length; i++) {
            int firstOperand = RandomUtils.generateNumber(1, CALCULATOR_UPPER_BOUND);
            int secondOperand = RandomUtils.generateNumber(1, CALCULATOR_UPPER_BOUND);
            char operation = OPERATORS[RandomUtils.generateNumber(0, OPERATIONS_MAX_INDEX)];

            questionsAnswers[i][0] = firstOperand + " " + operation + " " + secondOperand;
            questionsAnswers[i][1] = String.valueOf(calculateExpressionResult(firstOperand, secondOperand, operation));
        }

        Engine.run(TASK, questionsAnswers);
    }

    private static int calculateExpressionResult(int a, int b, char operation) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                throw new IllegalArgumentException("Illegal operation: '" + operation
                        + "', Operation must equal '+', '-' or '*'");
        }
    }
}
