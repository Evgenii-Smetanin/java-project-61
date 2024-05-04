package hexlet.code;

public class App {
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
            case 2:
                Engine.runEven();
                break;
            case 3:
                Engine.runCalculator();
                break;
            case 4:
                Engine.runGCD();
                break;
            case 5:
                Engine.runProgression();
                break;
            case 6:
                Engine.runPrime();
                break;
            default:
                break;
        }

        Cli.close();
    }
}
