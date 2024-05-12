package hexlet.code;

import hexlet.code.game.Calculator;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

public class App {
    private static final int GREET = 1;
    private static final int EXIT = 0;
    private static final int EVEN = 2;
    private static final int CALCULATOR = 3;
    private static final int Gcd = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.\n"
                + GREET + " - Greet\n"
                + EVEN + " - Even\n"
                + CALCULATOR + " - Calculator\n"
                + Gcd + " - GCD\n"
                + PROGRESSION + " - Progression\n"
                + PRIME + " - Prime\n"
                + EXIT + " - Exit");

        int gameNumber = Engine.getInt();
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
            case Gcd:
                GCD.run();
                break;
            case PROGRESSION:
                Progression.run();
                break;
            case PRIME:
                Prime.run();
                break;
            default:
                break;
        }
    }
}
