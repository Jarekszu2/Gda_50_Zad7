package packZad7.packStrategies;

import packZad7.ScannerWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ZgadywankaLiczbCieplejZimniej implements IStrategy {
    public void playGame() {
        Random random = new Random();
        int liczba = random.nextInt(100) + 1;
//        System.out.println(liczba);
        ScannerWork scannerWork = new ScannerWork();
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("Program wylosował liczbę z przedziału od 1 do 100.");
        System.out.println("Spróbuj ją odgadnąć w 10 próbach.");

        int counter = 0;
        boolean flag = false;
        for (int i = 1; i < 11; i++) {
            int liczbaUsera = scannerWork.getInt(1, 100);
            list.add(liczbaUsera);
            if (i == 1 && liczbaUsera == liczba) {
                counter++;
                System.out.println();
                System.out.println("Gratulacje, zgadłaś/eś za " + counter + " razem.");
            } else if (i == 1 && liczbaUsera != liczba) {
                counter++;
                System.out.println(i + ". Niestety to nie ta liczba, próbuj dalej.");
            }

            if (i > 1 && liczbaUsera == liczba) {
                counter++;
                System.out.println();
                System.out.println("Gratulacje, zgadłaś/eś za " + counter + " razem.");
                break;
            } else if (i > 1 && Math.abs(list.get(i - 1) - liczba) > Math.abs(list.get(i - 2) - liczba)) {
                System.out.println(i + ". zimniej");
                counter++;
            } else if (i > 1 && Math.abs(list.get(i - 1) - liczba) < Math.abs(list.get(i - 2) - liczba)) {
                System.out.println(i + ". cieplej");
                counter++;
            } else if (i > 1 && Math.abs(list.get(i - 1) - liczba) == Math.abs(list.get(i - 2) - liczba)) {
                System.err.println(i + ". Nie zmieniłaś/eś liczby!");
                counter++;
            }

            if (i == 10 && flag == false) {
                System.out.println();
                System.out.println("Koniec gry. Niestety ... nie zgadłaś/eś.");
            }
        }
    }
}
