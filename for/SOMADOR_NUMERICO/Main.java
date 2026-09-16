import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);

        int summe = 0;

        for (int zaehler = 1; zaehler <= 5; zaehler++) {
            System.out.println("Geben Sie den Wert ein:");
            int zahl = leser.nextInt();

            summe = summe + zahl;
            System.out.println("Die Summe ist: " + summe);
        }

        leser.close();
    }
}