import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);

        int summe = 0;
        char antwort;

        do {
            System.out.print("Geben Sie einen Wert ein: ");
            int wert = leser.nextInt();

            summe = summe + wert;

            System.out.println("Moechten Sie fortfahren? [S/N]");
            antwort = leser.next().toUpperCase().charAt(0);

        } while (antwort != 'N');

        System.out.println("Die Summe aller eingegebenen Werte ist " + summe);

        leser.close();
    }
}