package hexlet.code.game;

import java.util.Random;

public class Calculator implements Game {
    int correctAnswer;

    public Calculator() {
    }

    @Override
    public void showTask() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    public String showQuestion(Random random) {
        int firstOperand = random.nextInt(25) + 1;
        int secondOperand = random.nextInt(25) + 1;
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
        }

        System.out.println("Question: " + firstOperand + " " + operation + " " + secondOperand);
        return String.valueOf(correctAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        return Integer.parseInt(answer) == correctAnswer;
    }
}
