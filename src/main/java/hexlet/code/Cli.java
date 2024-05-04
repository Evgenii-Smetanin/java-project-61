package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static String getLine() {
        return sc.nextLine();
    }

    public static int getInt() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid game number");
            return getInt();
        }
    }

    public static void close() {
        if (sc != null) {
            sc.close();
        }
    }
}
