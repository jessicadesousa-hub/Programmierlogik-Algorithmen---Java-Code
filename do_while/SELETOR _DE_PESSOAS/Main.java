import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);

        int anzahlMaenner = 0;
        int anzahlFrauen = 0;
        char antwort;

        do {
            System.out.println("==================");
            System.out.println("PERSONENAUSWAHL");
            System.out.println("==================");

            System.out.print("Welches Geschlecht? [M/F]: ");
            char geschlecht = leser.next().toUpperCase().charAt(0);

            System.out.print("Wie alt?: ");
            int alter = leser.nextInt();

            System.out.println("Welche Haarfarbe?");
            System.out.println("[1] Schwarz");
            System.out.println("[2] Braun");
            System.out.println("[3] Blond");
            System.out.println("[4] Rot");
            int haarfarbe = leser.nextInt();

            if (geschlecht == 'M' && alter > 18 && haarfarbe == 2) {
                anzahlMaenner++;
            } else if (geschlecht == 'F' && alter >= 25 && alter <= 30 && haarfarbe == 3) {
                anzahlFrauen++;
            }

            System.out.print("Moechten Sie fortfahren? [S/N]: ");
            antwort = leser.next().toUpperCase().charAt(0);

        } while (antwort != 'N');

        System.out.println("---------------");
        System.out.println("ENDERGEBNIS");
        System.out.println("---------------");
        System.out.println("Gesamtzahl der Maenner ueber 18 Jahre mit braunen Haaren: " + anzahlMaenner);
        System.out.println("Gesamtzahl der Frauen zwischen 25 und 30 Jahren: " + anzahlFrauen);

        leser.close();
    }
}