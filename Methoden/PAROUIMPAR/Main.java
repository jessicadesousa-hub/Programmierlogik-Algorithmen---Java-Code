import java.util.Scanner;

public class Main {

    public static String pruefeGeradeOderUngerade(int wert) {
        if (wert % 2 == 0) {
            return "GERADE.";
        } else {
            return "UNGERADE.";
        }
    }

    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);

        System.out.print("Geben Sie eine Zahl ein: ");
        int zahl = leser.nextInt();

        String ergebnis = pruefeGeradeOderUngerade(zahl);

        System.out.println("Die Zahl " + zahl + " ist eine " + ergebnis + " Zahl.");

        leser.close();
    }
}