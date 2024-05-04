package hexlet.code.game;

import java.util.Random;

import static hexlet.code.game.GameSettings.CALCULATOR_UPPER_BOUND;

public class Calculator {
    private static int correctAnswer;

    public static String showQuestion(Random random) {
        int firstOperand = random.nextInt(CALCULATOR_UPPER_BOUND) + 1;
        int secondOperand = random.nextInt(CALCULATOR_UPPER_BOUND) + 1;
        String operation = "";

        switch (random.nextInt(3)) {
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

        System.out.println("Question: " + firstOperand + " " + operation + " " + secondOperand);
        return String.valueOf(correctAnswer);
    }

    public static boolean checkAnswer(String answer) {
        return Integer.parseInt(answer) == correctAnswer;
    }
}
