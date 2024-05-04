package hexlet.code;

public class App {
    private static final int EVEN = 2;
    private static final int CALCULATOR = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calculator\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");

        int gameNumber = Cli.getInt();
        System.out.println("Your choice: " + gameNumber);

        if (gameNumber == 0 || gameNumber > 6) {
            return;
        }

        Engine.setPlayerName(Cli.greet());

        switch (gameNumber) {
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

        Cli.close();
    }
}
