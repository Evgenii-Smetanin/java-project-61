package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String playerName = sc.nextLine();
        sc.close();
        System.out.println("Hello, " + playerName + "!");
    }
}
