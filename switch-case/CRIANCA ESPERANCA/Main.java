import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        int spendenOption;
        int betrag = 0;

        System.out.println("---------------------------");
        System.out.println("---- KINDER HOFFNUNG ----");
        System.out.println("---------------------------");
        System.out.println("Vielen Dank fuer Ihre Hilfe!");
        System.out.println("[1] Um 10 Euro zu spenden");
        System.out.println("[2] Um 25 Euro zu spenden");
        System.out.println("[3] Um 50 Euro zu spenden");
        System.out.println("[4] Um einen anderen Betrag zu spenden");
        System.out.println("[5] Zum Abbrechen");

        spendenOption = tastatur.nextInt();

        switch (spendenOption) {
            case 1:
                betrag = 10;
                break;
            case 2:
                betrag = 25;
                break;
            case 3:
                betrag = 50;
                break;
            case 4:
                System.out.print("Wie hoch ist der Spendenbetrag? ");
                betrag = tastatur.nextInt();
                break;
            case 5:
                betrag = 0;
                break;
            default:
                System.out.println("Ungueltige Option!");
                betrag = 0;
                break;
        }

        System.out.println("--------------------");
        System.out.println("Ihre Spende betrug: " + betrag + " Euro");
        System.out.println("Vielen Dank!");
        System.out.println("--------------------");

        tastatur.close();
    }
}