import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        int startWert;
        int endWert;
        int zaehler;

        System.out.print("Start: ");
        startWert = tastatur.nextInt();

        System.out.print("Ende: ");
        endWert = tastatur.nextInt();

        System.out.println("----------------");
        System.out.println("---- ZAEHLEN ----");
        System.out.println("----------------");

        if (endWert > startWert) {
            // Aufwaerts zaehlen
            zaehler = startWert;
            while (zaehler <= endWert) {
                System.out.print(zaehler + ", ");
                zaehler++;
            }
        } else {
            // Abwaerts zaehlen 
            zaehler = startWert;
            while (zaehler >= endWert) {
                System.out.print(zaehler + ", ");
                zaehler--;
            }
        }

        System.out.println(); // Zeilenumbruch am Ende
        tastatur.close();
    }
}