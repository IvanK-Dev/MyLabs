package laba14;

import java.util.Scanner;

class Util {
    private Util() {
    }
    public static  String GetFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
