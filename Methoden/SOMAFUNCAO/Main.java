import java.util.Scanner;

public class Main {

    public static int berechneSumme(int ersterWert, int zweiterWert) {
        return ersterWert + zweiterWert;
    }

    public static void main(String[] args) {
        Scanner leser = new Scanner(System.in);

        System.out.print("Geben Sie den ersten Wert ein: ");
        int ersterWert = leser.nextInt();

        System.out.print("Geben Sie den zweiten Wert ein: ");
        int zweiterWert = leser.nextInt();

        int summe = berechneSumme(ersterWert, zweiterWert);

        System.out.println("Die Summe von " + ersterWert + " und " + zweiterWert + " ist gleich " + summe);

        leser.close();
    }
}