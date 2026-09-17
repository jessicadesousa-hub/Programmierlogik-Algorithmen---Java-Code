import java.util.Scanner;

public class Main {

    public static void erstelleAntwortschluessel(Scanner tastatur, String[] antwortschluessel) {
        System.out.println("SCHRITT 1 - Erfassung des Antwortschluessels");
        System.out.println("------------------------------");

        for (int frageIndex = 0; frageIndex < 5; frageIndex++) {
            System.out.println("Frage " + (frageIndex + 1) + ":");
            antwortschluessel[frageIndex] = tastatur.nextLine();
        }
    }

    public static double berechnePruefungsnote(Scanner tastatur, String[] antwortschluessel) {
        double schuelerNote = 0.0;
        String[] schuelerAntworten = new String[5];

        System.out.println("Gegebene Antworten:");
        for (int frageIndex = 0; frageIndex < 5; frageIndex++) {
            System.out.println("Frage " + (frageIndex + 1) + ":");
            schuelerAntworten[frageIndex] = tastatur.nextLine();

            
            if (schuelerAntworten[frageIndex].equalsIgnoreCase(antwortschluessel[frageIndex])) {
                schuelerNote += 2.0;
            }
        }

        return schuelerNote;
    }

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        String[] antwortschluessel = new String[5];
        String[] schuelerNamen = new String[3];
        double[] schuelerNoten = new double[3];

        double summeNoten = 0.0;
        double klassendurchschnitt;

               erstelleAntwortschluessel(tastatur, antwortschluessel);

                for (int schuelerIndex = 0; schuelerIndex < 3; schuelerIndex++) {
            System.out.println("\n---------------");
            System.out.println("Schueler " + (schuelerIndex + 1) + ":");
            System.out.println("---------------");

            System.out.print("Name: ");
            schuelerNamen[schuelerIndex] = tastatur.nextLine();

            schuelerNoten[schuelerIndex] = berechnePruefungsnote(tastatur, antwortschluessel);
            summeNoten += schuelerNoten[schuelerIndex];
        }

        System.out.println("\nENDERGEBNISSE");
        System.out.println("-----------------------");

        for (int schuelerIndex = 0; schuelerIndex < 3; schuelerIndex++) {
            System.out.println(String.format("%-10s %.1f", schuelerNamen[schuelerIndex], schuelerNoten[schuelerIndex]));
        }

        klassendurchschnitt = summeNoten / 3.0;

        System.out.println("-----------------------");
        System.out.printf("Klassendurchschnitt: %.1f%n", klassendurchschnitt);

        tastatur.close();
    }
}