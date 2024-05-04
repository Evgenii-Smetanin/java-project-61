package hexlet.code.game;

import hexlet.code.Cli;

import java.util.Random;

public class Even {
    public static void run(String playerName) {
        Random random = new Random();
        int winCounter = 0;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (winCounter < 3) {
            int question =  random.nextInt(99) + 1;
            boolean isEven = question % 2 == 0;

            System.out.println("Question: " + question);
            String answer = Cli.getLine();
            System.out.println("Your answer: " + answer);

            boolean isAnswerYes = answer.equalsIgnoreCase("yes");
            boolean isAnswerNo = answer.equalsIgnoreCase("no");
            String correctAnswer = isEven ? "yes" : "no";

            if ((isAnswerYes && isEven) || (isAnswerNo && !isEven)) {
                System.out.println("Correct!");
                winCounter++;
                continue;
            }

            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n Let's try again, " + playerName + "!");
            winCounter = 0;
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
