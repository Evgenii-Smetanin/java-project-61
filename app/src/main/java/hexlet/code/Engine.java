package hexlet.code;

import hexlet.code.game.Calculator;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Random;

public class Engine {
    private static String playerName;
    private static String task;
    private static Random random;

    private static String answer;
    private static int winCounter;
    private static boolean endFlg;

    static {
        random = new Random();
        winCounter = 0;
    }

    public static void setPlayerName(String playersName) {
        playerName = playersName;
    }

    private static void showRoundResult(String correctAnswer, boolean isCorrect) {
        if (isCorrect) {
            System.out.println("Correct!");
            winCounter++;

            if (winCounter == 3) {
                congrat();
            }
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer
                    + "'.\nLet's try again, " + playerName + "!");
            endFlg = true;
        }
    }

    private static void getAnswer() {
        answer = Cli.getLine();
        System.out.println("Your answer: " + answer);
    }

    private static void printTask() {
        System.out.println(task);
    }

    private static void congrat() {
        System.out.println("Congratulations, " + playerName + "!");
    }

    public static void runCalculator() {
        task = "What is the result of the expression?";
        printTask();

        while (winCounter < 3) {
            String correctAnswer = Calculator.showQuestion(random);
            getAnswer();
            showRoundResult(correctAnswer, checkCalculatorAnswer());

            if (endFlg) {
                break;
            }
        }
    }

    private static boolean checkCalculatorAnswer() {
        try {
            return Calculator.checkAnswer(answer);
        } catch (NumberFormatException e) {
            System.out.println("Input a valid number");
            getAnswer();
            return checkCalculatorAnswer();
        }
    }

    public static void runEven() {
        task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        printTask();

        while (winCounter < 3) {
            String correctAnswer = Even.showQuestion(random);
            getAnswer();
            showRoundResult(correctAnswer, Even.checkAnswer(answer));

            if (endFlg) {
                break;
            }
        }
    }

    public static void runGCD() {
        task = "Find the greatest common divisor of given numbers.";
        printTask();

        while (winCounter < 3) {
            String correctAnswer = GCD.showQuestion(random);
            getAnswer();
            showRoundResult(correctAnswer, checkGCDAnswer());

            if (endFlg) {
                break;
            }
        }
    }

    private static boolean checkGCDAnswer() {
        try {
            return GCD.checkAnswer(answer);
        } catch (NumberFormatException e) {
            System.out.println("Input a valid number");
            getAnswer();
            return checkGCDAnswer();
        }
    }

    public static void runPrime() {
        task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        printTask();

        while (winCounter < 3) {
            String correctAnswer = Prime.showQuestion(random);
            getAnswer();
            showRoundResult(correctAnswer, Prime.checkAnswer(answer));

            if (endFlg) {
                break;
            }
        }
    }

    public static void runProgression() {
        task = "What number is missing in the progression?";
        printTask();

        while (winCounter < 3) {
            String correctAnswer = Progression.showQuestion(random);
            getAnswer();
            showRoundResult(correctAnswer, checkProgressionAnswer());

            if (endFlg) {
                break;
            }
        }
    }

    private static boolean checkProgressionAnswer() {
        try {
            return Progression.checkAnswer(answer);
        } catch (NumberFormatException e) {
            System.out.println("Input a valid number");
            getAnswer();
            return checkProgressionAnswer();
        }
    }
}
