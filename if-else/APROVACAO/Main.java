import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        double ersteNote;
        double zweiteNote;
        double durchschnitt;

        System.out.print("Geben Sie Ihre erste Note ein: ");
        ersteNote = tastatur.nextDouble();
        System.out.print("Geben Sie Ihre zweite Note ein: ");
        zweiteNote = tastatur.nextDouble();

        durchschnitt = (ersteNote + zweiteNote) / 2.0;

        System.out.printf("Der Durchschnitt war: %.2f%n", durchschnitt);

        if (durchschnitt >= 7.0) {
            System.out.println("Schueler bestanden!");
        } else if (durchschnitt >= 5.0) {
            System.out.println("Schueler in Nachpruefung");
        } else {
            System.out.println("Schueler nicht bestanden");
        }

        tastatur.close();
    }
}