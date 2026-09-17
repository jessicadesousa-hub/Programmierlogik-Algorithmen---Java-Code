import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        int[] vektor = new int[4];
        int hilfsvariable;

        for (int i = 0; i < 4; i++) {
            System.out.print("Geben Sie einen Wert ein: ");
            vektor[i] = tastatur.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (vektor[i] > vektor[j]) {
                    hilfsvariable = vektor[i];
                    vektor[i] = vektor[j];
                    vektor[j] = hilfsvariable;
                }
            }
        }

        System.out.println("\nSortierter Vektor:");
        for (int i = 0; i < 4; i++) {
            System.out.println("{" + vektor[i] + "}");
        }

        tastatur.close();
    }
}