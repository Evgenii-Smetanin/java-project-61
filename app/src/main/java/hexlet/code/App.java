package hexlet.code;

import hexlet.code.game.Calculator;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EXIT = 0;
    private static final int EVEN = 2;
    private static final int CALCULATOR = 3;
    private static final int GCD_NUM = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IncorrectGameNumberException {

        System.out.println("Please enter the game number and press Enter.\n"
                + GREET + " - Greet\n"
                + EVEN + " - Even\n"
                + CALCULATOR + " - Calculator\n"
                + GCD_NUM + " - GCD\n"
                + PROGRESSION + " - Progression\n"
                + PRIME + " - Prime\n"
                + EXIT + " - Exit");

        int gameNumber = getInt();
        System.out.println("Your choice: " + gameNumber);

        switch (gameNumber) {
            case EXIT:
                break;
            case GREET:
                Cli.greet();
                break;
            case EVEN:
                Even.run();
                break;
            case CALCULATOR:
                Calculator.run();
                break;
            case GCD_NUM:
                GCD.run();
                break;
            case PROGRESSION:
                Progression.run();
                break;
            case PRIME:
                Prime.run();
                break;
            default:
                throw new IncorrectGameNumberException("Unknown game number: " + gameNumber);
        }

        sc.close();
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
