package hexlet.code.game;

import java.util.Random;

public class Even implements Game {
    String correctAnswer;

    public Even() {
    }

    @Override
    public void showTask() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    @Override
    public String showQuestion(Random random) {
        int question = random.nextInt(99) + 1;
        boolean isEven = question % 2 == 0;
        correctAnswer = isEven ? "yes" : "no";

        System.out.println("Question: " + question);
        return correctAnswer;
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }
}
