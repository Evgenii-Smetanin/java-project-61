package hexlet.code;

public class App {
    private static final int GREET = 1;
    private static final int EXIT = 0;
    private static final int EVEN = 2;
    private static final int CALCULATOR = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.\n"
                + GREET + " - Greet\n"
                + EVEN + " - Even\n"
                + CALCULATOR + " - Calculator\n"
                + GCD + " - GCD\n"
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
            case EVEN:
                Engine.runEven();
                break;
            case CALCULATOR:
                Engine.runCalculator();
                break;
            case GCD:
                Engine.runGCD();
                break;
            case PROGRESSION:
                Engine.runProgression();
                break;
            case PRIME:
                Engine.runPrime();
                break;
            default:
                break;
        }
    }
}
