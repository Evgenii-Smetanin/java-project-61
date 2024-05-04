package hexlet.code.game;

import java.util.Random;

public interface Game {
    boolean checkAnswer(String answer);

    String getTask();

    String showQuestion(Random random);
}
