import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        double ersteNote;
        double zweiteNote;
        double durchschnitt;

        System.out.println("Wie lautet die erste Note?");
        ersteNote = tastatur.nextDouble();

        System.out.println("Wie lautet die zweite Note?");
        zweiteNote = tastatur.nextDouble();

        durchschnitt = (ersteNote + zweiteNote) / 2.0;

        System.out.println("Durchschnitt: " + durchschnitt);

        if (durchschnitt >= 9.0 && durchschnitt <= 10.0) {
            System.out.println("Leistungsklasse A");
        } else if (durchschnitt >= 8.0) {
            System.out.println("Leistungsklasse B");
        } else if (durchschnitt >= 7.0) {
            System.out.println("Leistungsklasse C");
        } else if (durchschnitt >= 6.0) {
            System.out.println("Leistungsklasse D");
        } else if (durchschnitt >= 5.0) {
            System.out.println("Leistungsklasse E");
        } else {
            System.out.println("Leistungsklasse F");
        }

        tastatur.close();
    }
}