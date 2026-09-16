import java.util.Scanner;

public class Main {

    // Prozedur (void-Methode) zur Anzeige der Kopfzeile per Wertuebergabe (Pass-by-Value)
    public static void zeigeKopfzeile(double hoechstGewicht) {
        System.out.println("-------------------------------");
        System.out.println("------ Schwerste-Person-Detektor ------");
        System.out.println("Schwerstes Gewicht bis jetzt: " + hoechstGewicht + " kg");
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        String name;
        String schwerstePerson = "";
        double gewicht;
        double hoechstGewicht = 0.0;

        zeigeKopfzeile(hoechstGewicht);

        for (int zaehler = 1; zaehler <= 5; zaehler++) {
            System.out.print("Geben Sie den Namen ein: ");
            name = tastatur.nextLine();

            System.out.print("Wie viel wiegt " + name + "? ");
            gewicht = tastatur.nextDouble();
            tastatur.nextLine(); // Puffer leeren

            if (gewicht > hoechstGewicht) {
                hoechstGewicht = gewicht;
                schwerstePerson = name;
            }

            zeigeKopfzeile(hoechstGewicht);
        }

        System.out.println("Die schwerste Person war " + schwerstePerson + " mit " + hoechstGewicht + " kg.");

        tastatur.close();
    }
}