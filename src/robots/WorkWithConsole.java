package robots;

import java.util.Scanner;

public class WorkWithConsole {
    public static String getNameFromConsole() {
        Scanner scanner = new Scanner(System.in);

        return scanner.next();


    }

    public static String getSymbolFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.length() > 1) {
            System.out.println("You entered more than one letter, only the first one will play! letter - " + s.toUpperCase().charAt(0));
            s = s.substring(0, 1);
            System.out.println();
        }
        return s.toUpperCase();
    }


}