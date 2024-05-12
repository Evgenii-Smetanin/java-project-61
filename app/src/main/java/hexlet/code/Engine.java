package hexlet.code;

import hexlet.code.game.Calculator;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static final int ROUNDS = 3;
    private static String playerName;
    private static String task;
    private static Random random;

    private static String answer;
    private static int winCounter;
    private static boolean endFlg;
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
        random = new Random();
        winCounter = 0;
    }

    private static void showRoundResult(String correctAnswer, boolean isCorrect) {
        if (isCorrect) {
            System.out.println("Correct!");
            winCounter++;

            if (winCounter == ROUNDS) {
                congrat();
            }
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer
                    + "'.\nLet's try again, " + playerName + "!");
            endFlg = true;
        }
    }

    private static void getAnswer() {
        answer = sc.nextLine();
        System.out.println("Your answer: " + answer);
    }

    private static void printTask() {
        System.out.println(task);
    }

    private static void congrat() {
        System.out.println("Congratulations, " + playerName + "!");
    }

    public static void runCalculator() {
        greet();
        task = "What is the result of the expression?";
        printTask();

        while (winCounter < ROUNDS) {
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
        greet();
        task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        printTask();

        while (winCounter < ROUNDS) {
            String correctAnswer = Even.showQuestion(random);
            getAnswer();
            showRoundResult(correctAnswer, Even.checkAnswer(answer));

            if (endFlg) {
                break;
            }
        }
    }

    public static void runGCD() {
        greet();
        task = "Find the greatest common divisor of given numbers.";
        printTask();

        while (winCounter < ROUNDS) {
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
        greet();
        task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        printTask();

        while (winCounter < ROUNDS) {
            String correctAnswer = Prime.showQuestion(random);
            getAnswer();
            showRoundResult(correctAnswer, Prime.checkAnswer(answer));

            if (endFlg) {
                break;
            }
        }
    }

    public static void runProgression() {
        greet();
        task = "What number is missing in the progression?";
        printTask();

        while (winCounter < ROUNDS) {
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

    public static void greet() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        playerName = sc.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }

    public static int getInt() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
            return getInt();
        }
    }
}
