package packZad7;

import packZad7.packStrategies.ZgadywankaLiczbCieplejZimniej;
import packZad7.packStrategies.ZgadywankaLiczbWiecejMniej;

/*
7 Zadanie:
Napisz aplikację i w niej klasę SilnikDoGry. Stwórz w klasie mechanizm do zmiany gry, w którą chciałby grać użytkownik. Mechanizm powinien pozwalać na dodawanie nowych gier.

Gry do zaimplementowania:
 - gra która losuje dwie wartości i działanie, a użytkownik musi wpisać wynik. Gra trwa 10 rund. Po skończonej rozgrywce użytkownikowi wypisywany jest wynik
 - gra która losuje kierunek geograficzny (S, E, N, W, NE, NW, SE, SW). Uzytkownik musi wpisać jaki to kierunek "nie-geograficzny" mając na myśli: dół, prawo, góra, lewo, góra-lewo, góra-prawo, dół-lewo, dół-prawo). Gra trwa 10 rund, po skończonej rozgrywce użytkownikowi wypisywany jest wynik.
 - gra w zgadywankę. Losowana jest liczba a użytkownik musi ją odgadnąć. Użytkownik ma 10 szans. Program odpowiada "mniej" / "więcej". Jeśli użytkownik trafi w mniej niż 10 rund, to wygrywa i wypisywany jest mu jego numer trafionej odpowiedzi (np. "Trafiłeś za 3 razem").
 - ** gra w zgadywankę (ta sama co wyżej), tylko użytkownikowi nie jest podawana podpowiedź mniej/więcej a "cieplej" "zimniej". Jeśli różnica między odgadniętą liczbą a prawidłową rośnie, to mówimy "zimniej", jeśli maleje to mówimy "cieplej".

 */
public class Main {
    public static void main(String[] args) {
        System.out.println();
        ScannerWork scannerWork = new ScannerWork();
        SilnikDoGry silnikDoGry = new SilnikDoGry();

        System.out.println("Program daje możliwość wyboru gry.");
        boolean flag = false;
        char znak = 'a';
        do {
            System.out.println();
            System.out.println("Wybierz:\n a) Zgadywanka liczb Wiecej-Mniej\n b) Zgadywanka liczb Cieplej-Zimniej\n w) koniec ");
            znak = scannerWork.getChar();

            switch (znak) {
                case 'a':
                    System.out.println();
                    silnikDoGry.setStrategy(new ZgadywankaLiczbWiecejMniej());
                    silnikDoGry.requestGame();
                    break;
                case 'b':
                    System.out.println();
                    silnikDoGry.setStrategy(new ZgadywankaLiczbCieplejZimniej());
                    silnikDoGry.requestGame();
                    break;
                case 'w':
                    flag = true;
                    break;
            }
        } while (!flag);
    }
}
