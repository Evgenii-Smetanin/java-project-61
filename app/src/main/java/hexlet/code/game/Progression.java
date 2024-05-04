package hexlet.code.game;

import java.util.Random;

public class Progression implements Game {
    int correctAnswer;

    @Override
    public String getTask() {
        return "What number is missing in the progression?";
    }

    @Override
    public String showQuestion(Random random) {
        int length = random.nextInt(6) + 5;
        int position = random.nextInt(length);
        int element = random.nextInt(30);
        int step = random.nextInt(10) + 1;

        StringBuilder sb = new StringBuilder("Question:");

        for (int i = 0; i < length; i++) {
            sb.append(" ");

            if (i > 0) {
                element += step;
            }

            if (i == position) {
                sb.append("..");
                correctAnswer = element;
            } else {
                sb.append(element);
            }
        }

        System.out.println(sb.toString());
        return String.valueOf(correctAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        return Integer.parseInt(answer) == correctAnswer;
    }
}
