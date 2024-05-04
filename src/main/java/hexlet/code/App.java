package hexlet.code;

import hexlet.code.game.Even;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        int gameNumber = Cli.getInt();

        if (gameNumber == 0 || gameNumber > 6) {
            return;
        }

        String playerName = greet();

        switch (gameNumber) {
            case 2:
                Even.run(playerName);
                break;
            case 3:
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

    public static String greet() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String playerName = Cli.getLine();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }
}
