Código Java (Main.java)

Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);

        int anzahlZwischen0und10 = 0;
        int summeUngerade = 0;

        for (int zaehler = 1; zaehler <= 6; zaehler++) {
            System.out.println("Geben Sie einen Wert ein: ");
            int wert = leser.nextInt();

            if (wert >= 0 && wert <= 10) {
                anzahlZwischen0und10 = anzahlZwischen0und10 + 1;

                if (wert % 2 != 0) {
                    summeUngerade = summeUngerade + wert;
                }
            }
        }

        System.out.println("Insgesamt gab es " + anzahlZwischen0und10 + " Werte zwischen 0 und 10.");
        System.out.println("Und die Summe der ungeraden Zahlen war " + summeUngerade);

        leser.close();
    }
}