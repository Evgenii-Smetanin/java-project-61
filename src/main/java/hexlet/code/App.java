package hexlet.code;

import hexlet.code.game.Calculator;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Progression;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calculator\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "0 - Exit");

        int gameNumber = Cli.getInt();
        System.out.println("Your choice: " + gameNumber);

        if (gameNumber == 0 || gameNumber > 6) {
            return;
        }

        Engine engine = new Engine(Cli.greet());

        switch (gameNumber) {
            case 2:
                engine.run(new Even());
                break;
            case 3:
                engine.run(new Calculator());
                break;
            case 4:
                engine.run(new GCD());
                break;
            case 5:
                engine.run(new Progression());
                break;
            case 6:
                break;
        }

        Cli.close();
    }
}
