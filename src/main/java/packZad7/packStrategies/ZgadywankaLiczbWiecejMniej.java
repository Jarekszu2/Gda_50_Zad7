package packZad7.packStrategies;

import packZad7.ScannerWork;

import java.util.Random;

public class ZgadywankaLiczbWiecejMniej implements IStrategy {
    public void playGame() {
        Random random = new Random();
        int liczba = random.nextInt(100) + 1;
//        System.out.println(liczba);
        ScannerWork scannerWork = new ScannerWork();

        System.out.println("Program wylosował liczbę z przedziału od 1 do 100.");
        System.out.println("Spróbuj ją odgadnąć w 10 próbach.");

        int counter = 0;
        boolean flag = false;
        for (int i = 1; i < 11; i++) {
            int liczbaUsera = scannerWork.getInt(1, 100);
            if (liczbaUsera > liczba) {
                System.out.println(i + ". mniej");
                counter++;
            } else if (liczbaUsera < liczba) {
                System.out.println(i + ". więcej");
                counter++;
            } else if (liczbaUsera == liczba) {
                counter++;
                System.out.println();
                System.out.println("Gratulacje, zgadłaś/eś za " + counter + " razem.");
                break;
            }
            if (i == 10 && flag == false) {
                System.out.println();
                System.out.println("Koniec gry. Niestety ... nie zgadłaś/eś.");
            }
        }
    }
}
