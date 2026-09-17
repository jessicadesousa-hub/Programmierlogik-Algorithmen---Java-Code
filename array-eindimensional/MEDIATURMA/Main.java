import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        String[] name = new String[4];
        double[] ersteNote = new double[4];
        double[] zweiteNote = new double[4];
        double[] durchschnitt = new double[4];

        double summeDurchschnitt = 0.0;
        double klassendurchschnitt;
        int anzahlUeberDurchschnitt = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("SCHUELER " + (i + 1));
            
            System.out.println("Name: ");
            name[i] = tastatur.nextLine();

            System.out.println("Erste Note: ");
            ersteNote[i] = tastatur.nextDouble();

            System.out.println("Zweite Note: ");
            zweiteNote[i] = tastatur.nextDouble();
            tastatur.nextLine(); // Puffer leeren

            durchschnitt[i] = (ersteNote[i] + zweiteNote[i]) / 2.0;
            summeDurchschnitt += durchschnitt[i];
        }

        klassendurchschnitt = summeDurchschnitt / 4.0;

        System.out.println("\nSCHUELERLISTE");
        System.out.println("------------------");

        for (int i = 0; i < 4; i++) {
                       System.out.println(String.format("%-15s %.1f", name[i], durchschnitt[i]));

            if (durchschnitt[i] > klassendurchschnitt) {
                anzahlUeberDurchschnitt++;
            }
        }

        System.out.printf("Insgesamt haben %d Schueler einen Durchschnitt ueber dem Klassendurchschnitt von %.1f%n",
                anzahlUeberDurchschnitt, klassendurchschnitt);

        tastatur.close();
    }
}