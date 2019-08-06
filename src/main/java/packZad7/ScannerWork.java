package packZad7;

import java.util.Scanner;

public class ScannerWork {
    Scanner scanner = new Scanner(System.in);

    public char getChar() {
        boolean flag = false;
        char znak = 'a';
        do {
            System.out.println();
            System.out.println("Wybierz a/b/w ?");
            znak = scanner.next().charAt(0);
            if (znak == 'a' || znak == 'b' || znak == 'w') {
                flag = true;
            }
        } while (!flag);
        return znak;
    }

    public int getInt(int min, int max) {
        boolean flag = false;
        int liczba = 0;
        do {
            System.out.println();
            System.out.println("Podaj liczbę:");
            String liczbaString = scanner.next();
            try {
                liczba = Integer.valueOf(liczbaString);
            } catch (NumberFormatException e) {
                System.err.println("Wprowadź liczbę.");
            }
            if (liczba >= min && liczba <= max) {
                flag = true;
            }
        } while (!flag);
        return liczba;
    }
}
