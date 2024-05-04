package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static String greet() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String playerName = getLine();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }

    public static String getLine() {
        return sc.nextLine();
    }

    public static int getInt() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
            return getInt();
        }
    }

    public static void close() {
        if (sc != null) {
            sc.close();
        }
    }
}
