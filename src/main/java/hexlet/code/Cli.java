package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        return input;
    }
}
