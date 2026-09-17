import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        String[] mannschaften = new String[3];

        System.out.println("---------------------");
        System.out.println("FUSSBALL-MEISTERSCHAFT");
        System.out.println("---------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println("Name der Mannschaft:");
            mannschaften[i] = tastatur.nextLine();
        }

        System.out.println("\n------------------");
        System.out.println("SPIELPLAN");
        System.out.println("------------------");

        for (int heimIndex = 0; heimIndex < 3; heimIndex++) {
            for (int auswaertsIndex = 0; auswaertsIndex < 3; auswaertsIndex++) {
                if (heimIndex != auswaertsIndex) {
                    System.out.println(String.format("%-15s [  ] x [  ]  %-15s", 
                            mannschaften[heimIndex], mannschaften[auswaertsIndex]));
                }
            }
        }

        tastatur.close();
    }
}