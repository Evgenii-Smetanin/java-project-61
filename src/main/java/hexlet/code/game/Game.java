package hexlet.code.game;

import java.util.Random;

public interface Game {
    public boolean checkAnswer(String answer);

    public String getTask();

    public String showQuestion(Random random);
}
