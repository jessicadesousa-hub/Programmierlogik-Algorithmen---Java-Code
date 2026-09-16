Código Java (Main.java)

Java
public class Main {
    public static void main(String[] args) {
        int ersteZahl = 0;
        System.out.print(ersteZahl + " ");

        int zweiteZahl = 1;
        System.out.print(zweiteZahl + " ");

        for (int zaehler = 3; zaehler <= 15; zaehler++) {
            int naechsteZahl = ersteZahl + zweiteZahl;
            System.out.print(naechsteZahl + " ");

            ersteZahl = zweiteZahl;
            zweiteZahl = naechsteZahl;
        }
    }
}