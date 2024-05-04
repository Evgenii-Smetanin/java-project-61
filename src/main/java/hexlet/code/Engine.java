package hexlet.code;

import hexlet.code.game.Game;

import java.util.Random;

public class Engine {
    String playerName;
    Game game;

    public Engine(String playerName) {
        this.playerName = playerName;
    }

    public void run(Game game) {
        this.game = game;
        Random random = new Random();
        int winCounter = 0;

        System.out.println(game.getTask());

        while (winCounter < 3) {
            String correctAnswer = game.showQuestion(random);
            String answer = getAnswer();

            if (checkAnswer(answer)) {
                System.out.println("Correct!");
                winCounter++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\nLet's try again, " + playerName + "!");
                winCounter = 0;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }

    private String getAnswer() {
        String answer = Cli.getLine();
        System.out.println("Your answer: " + answer);
        return answer;
    }

    private boolean checkAnswer(String answer) {
        try {
            return game.checkAnswer(answer);
        } catch (NumberFormatException e) {
            System.out.println("Input a valid number");
            return checkAnswer(getAnswer());
        }
    }
}
