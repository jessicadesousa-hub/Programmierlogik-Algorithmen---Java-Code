import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);

        int zaehler = 1;

        System.out.print("Welche Einmaleins-Tabelle moechten Sie sehen? ");
        int zahl = leser.nextInt();

        do {
            int ergebnis = zaehler * zahl;
            System.out.println(zaehler + " x " + zahl + " = " + ergebnis);
            zaehler++;
        } while (zaehler <= 10);

        leser.close();
    }
}