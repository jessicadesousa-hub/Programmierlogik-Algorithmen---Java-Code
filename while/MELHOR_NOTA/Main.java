import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);

        
        int anzahlSchueler;
        int zaehler = 1;
        String schuelerName;
        String besteSchuelerName = "";
        double note;
        double höchsteNote = 0.0;

        System.out.println("Schule Santa Paciencia");
        System.out.println("---------------------");
        System.out.print("Wie viele Schüler hat die Klasse? ");
        anzahlSchueler = leser.nextInt();


        while (zaehler <= anzahlSchueler) {
            System.out.println("Schüler " + zaehler);
            System.out.print("Name des Schülers: ");
            schuelerName = leser.next();

            System.out.print("Note von " + schuelerName + ": ");
            note = leser.nextDouble();

      
            if (note > höchsteNote) {
                höchsteNote = note;
                besteSchuelerName = schuelerName;
            }

            zaehler = zaehler + 1;
        }

                System.out.println("Die beste Leistung erzielte " + besteSchuelerName);
        System.out.println("mit der Note " + höchsteNote);

        leser.close();
    }
}