import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);
        char option;

        do {
            System.out.println("================");
            System.out.println("|     MENUE    |");
            System.out.println("================");
            System.out.println("[1] Von 1 bis 10");
            System.out.println("[2] Von 10 bis 1");
            System.out.println("[3] Beenden");
            System.out.println("================");
            
            option = leser.next().charAt(0);

            if (option == '1') {
                int zaehler = 1;
                do {
                    System.out.println(zaehler);
                    zaehler++;
                } while (zaehler <= 10);

            } else if (option == '2') {
                int zaehler = 10;
                do {
                    System.out.println(zaehler);
                    zaehler--;
                } while (zaehler >= 1);

            } else if (option == '3') {
                System.out.println("Beenden...");
            }

        } while (option != '3');

        leser.close();
    }
}