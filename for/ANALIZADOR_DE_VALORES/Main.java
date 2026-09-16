import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);

        int summe = 0;
        int teilbarDurch5 = 0;
        int nullWerte = 0;
        int summeGerade = 0;
        double durchschnitt;

        for (int zaehler = 1; zaehler <= 5; zaehler++) {
            System.out.println("Geben Sie die " + zaehler + ". Zahl ein:");
            int wert = leser.nextInt();

            summe = summe + wert;

            if (wert % 5 == 0) {
                teilbarDurch5 = teilbarDurch5 + 1;
            }

            if (wert == 0) {
                nullWerte = nullWerte + 1;
            }

            if (wert % 2 == 0) {
                summeGerade = summeGerade + wert;
            }
        }

        durchschnitt = summe / 5.0;

        System.out.println("Die Summe der Werte ist " + summe);
        System.out.printf("Der Durchschnitt der Werte ist %.1f\n", durchschnitt);
        System.out.println("Werte teilbar durch fünf: " + teilbarDurch5);
        System.out.println("Nullwerte: " + nullWerte);
        System.out.println("Die Summe der geraden Werte ist " + summeGerade);

        leser.close();
    }
}