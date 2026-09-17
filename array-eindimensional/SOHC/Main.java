import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        String[] namenMitC = new String[10];
        String aktuellerName;
        int anzahlMitC = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Geben Sie Ihren Namen ein:");
            aktuellerName = tastatur.nextLine();

(unabhaengig von Gross-/Kleinschreibung)
            if (aktuellerName.toUpperCase().startsWith("C")) {
                namenMitC[anzahlMitC] = aktuellerName;
                anzahlMitC++;
            }
        }

        System.out.println("\nENDLISTE");
        for (int i = 0; i < anzahlMitC; i++) {
            System.out.println(namenMitC[i]);
        }

        tastatur.close();
    }
}