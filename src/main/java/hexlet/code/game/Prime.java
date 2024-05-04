package hexlet.code.game;

import java.util.Random;

public class Prime implements Game {
    String correctAnswer;

    @Override
    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String showQuestion(Random random) {
        int question = random.nextInt(99) + 2;
        boolean isPrime = true;

        for (int i = question - 1; i > 1; i--) {
            if (question % i == 0) {
                isPrime = false;
                break;
            }
        }

        correctAnswer = isPrime ? "yes" : "no";
        System.out.println("Question: " + question);
        return correctAnswer;
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }
}
