import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);

        int zaehler = 1;
        int summe = 0;
        int zahl;
        int groessterWert = Integer.MIN_VALUE;
        int kleinsterWert = Integer.MAX_VALUE;

        while (zaehler <= 5) {
            System.out.println("Geben Sie den Wert ein:");
            zahl = leser.nextInt();

            if (zahl > groessterWert) {
                groessterWert = zahl;
            }

            if (zahl < kleinsterWert) {
                kleinsterWert = zahl;
            }

            summe = summe + zahl;
            zaehler = zaehler + 1;
        }

        System.out.println("Die Summe aller Werte ist " + summe);
        System.out.println("Der größte eingegebene Wert war " + groessterWert);
        System.out.println("Der kleinste eingegebene Wert war " + kleinsterWert);

        leser.close();
    }
}