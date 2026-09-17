import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        int[] werte = new int[4];
        int anzahlGeradeZahlen = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Geben Sie den " + (i + 1) + ". Wert ein: ");
            werte[i] = tastatur.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            if (werte[i] % 2 == 0) {
                anzahlGeradeZahlen++;
                System.out.println("GERADE Zahl an Position " + (i + 1));
            }
        }

        System.out.println("Gesamtzahl der geraden Zahlen: " + anzahlGeradeZahlen);

        tastatur.close();
    }
}