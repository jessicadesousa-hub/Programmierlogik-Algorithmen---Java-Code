import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        int toreTeamA;
        int toreTeamB;
        int tordifferenz;

        System.out.println("Wie viele Tore hat Vasco erzielt?");
        toreTeamA = tastatur.nextInt();

        System.out.println("Wie viele Tore hat Flamengo erzielt?");
        toreTeamB = tastatur.nextInt();

        // Berechnung der Differenz genau wie im Visualg-Original
        if (toreTeamA > toreTeamB) {
            tordifferenz = toreTeamA - toreTeamB;
        } else {
            tordifferenz = toreTeamB - toreTeamA;
        }

        System.out.println("Die Tordifferenz betrug " + tordifferenz);
        System.out.print("Tore.");

        switch (tordifferenz) {
            case 0:
                System.out.println(" STATUS: UNENTSCHIEDEN ");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println(" STATUS: NORMALES SPIEL ");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println(" STATUS: KANTERSIEG ");
                break;
            default:
                System.out.println(" STATUS: UNGEWOEHNLICHES ERGEBNIS. ");
                System.out.println(" Haben Sie die Daten korrekt eingegeben? ");
                break;
        }

        System.out.println("-----------------------");

        tastatur.close();
    }
}