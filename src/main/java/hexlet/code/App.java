package hexlet.code;

import hexlet.code.game.Calculator;
import hexlet.code.game.Even;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calculator\n0 - Exit");
        int gameNumber = Cli.getInt();

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
                break;
            case 5:
                break;
            case 6:
                break;
        }

        Cli.close();
    }
}
