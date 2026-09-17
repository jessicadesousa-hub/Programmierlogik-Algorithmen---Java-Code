import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        int aktuellesJahr;
        int geburtsjahr;
        int alter;

        System.out.print("In welchem Jahr befinden wir uns? ");
        aktuellesJahr = tastatur.nextInt();

        System.out.print("In welchem Jahr wurden Sie geboren? ");
        geburtsjahr = tastatur.nextInt();

        alter = aktuellesJahr - geburtsjahr;

        if (alter >= 18) {
            System.out.println("Sie sind berechtigt, den Fuehrerschein zu machen.");
        } else {
            System.out.println("Sie sind nicht berechtigt, den Fuehrerschein zu machen.");
        }

        tastatur.close();
    }
}