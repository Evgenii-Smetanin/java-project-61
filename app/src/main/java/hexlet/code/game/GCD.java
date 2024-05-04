package hexlet.code.game;

import java.util.Random;

public class GCD {
    private static int correctAnswer;

    public static String showQuestion(Random random) {
        int firstOperand = random.nextInt(50) + 1;
        int secondOperand = random.nextInt(50) + 1;

        System.out.println("Question: " + firstOperand + " " + secondOperand);

        correctAnswer = firstOperand > secondOperand
                ? gcdByEuclidsAlgorithm(firstOperand, secondOperand)
                : gcdByEuclidsAlgorithm(secondOperand, firstOperand);

        return String.valueOf(correctAnswer);
    }

    public static boolean checkAnswer(String answer) {
        return Integer.parseInt(answer) == correctAnswer;
    }

    private static int gcdByEuclidsAlgorithm(int firstOperand, int secondOperand) {
        if (secondOperand == 0) {
            return firstOperand;
        }
        return gcdByEuclidsAlgorithm(secondOperand, firstOperand % secondOperand);
    }
}
