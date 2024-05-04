package hexlet.code.game;

import java.util.Random;

public class GCD implements Game {
    int correctAnswer;

    @Override
    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String showQuestion(Random random) {
        int firstOperand = random.nextInt(50) + 1;
        int secondOperand = random.nextInt(50) + 1;

        System.out.println("Question: " + firstOperand + " " + secondOperand);

        correctAnswer = firstOperand > secondOperand
                ? gcdByEuclidsAlgorithm(firstOperand, secondOperand)
                : gcdByEuclidsAlgorithm(secondOperand, firstOperand);

        return String.valueOf(correctAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        return Integer.parseInt(answer) == correctAnswer;
    }

    private int gcdByEuclidsAlgorithm(int firstOperand, int secondOperand) {
        if (secondOperand == 0) {
            return firstOperand;
        }
        return gcdByEuclidsAlgorithm(secondOperand, firstOperand % secondOperand);
    }
}
