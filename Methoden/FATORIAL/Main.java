import java.util.Scanner;

public class Main {

    public static int berechneFakultaet(int wert) {
        int ergebnis = 1;
        for (int zaehler = 1; zaehler <= wert; zaehler++) {
            ergebnis = ergebnis * zaehler;
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);

        System.out.print("Geben Sie eine Zahl ein: ");
        int zahl = leser.nextInt();

        int fakultaet = berechneFakultaet(zahl);

        System.out.println("Der Wert von " + zahl + "! ist " + fakultaet);

        leser.close();
    }
}