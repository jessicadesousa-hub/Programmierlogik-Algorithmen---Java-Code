public class Main {
    public static void main(String[] args) {
        // Fortschreitender Zähler (1 bis 10)
        for (int zaehler = 1; zaehler <= 10; zaehler++) {
            System.out.println(zaehler);
        }

        // Rückschreitender Zähler in 2er-Schritten (10 bis 1)
        for (int zaehler = 10; zaehler >= 1; zaehler -= 2) {
            System.out.println(zaehler);
        }
    }
}