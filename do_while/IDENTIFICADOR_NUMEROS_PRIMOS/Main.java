import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);

        int zaehler = 1;
        int anzahlTeiler = 0;

        System.out.println("Geben Sie eine Zahl ein: ");
        int zahl = leser.nextInt();

        do {
            System.out.println(zaehler);
            if (zahl % zaehler == 0) {
                anzahlTeiler = anzahlTeiler + 1;
            }
            zaehler = zaehler + 1;
        } while (zaehler <= zahl);

        System.out.println("Insgesamt gibt es " + anzahlTeiler + " teilbare Werte.");

        if (anzahlTeiler > 2) {
            System.out.println("Dies ist keine Primzahl");
        } else {
            System.out.println("Dies ist eine Primzahl");
        }

        leser.close();
    }
}