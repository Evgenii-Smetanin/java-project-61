package hexlet.code.game;

import java.util.Random;

public interface Game {
    public boolean checkAnswer(String answer);

    public void showTask();

    public String showQuestion(Random random);
}
