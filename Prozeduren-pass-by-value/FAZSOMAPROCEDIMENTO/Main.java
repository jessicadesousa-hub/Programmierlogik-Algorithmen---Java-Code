public class Main {

    public static void berechneSumme(int ersterWert, int zweiterWert) {
        System.out.println("Ich habe den Wert " + ersterWert + " erhalten");
        System.out.println("Ich habe den Wert " + zweiterWert + " erhalten");
        System.out.println("Die Summe der beiden ist " + (ersterWert + zweiterWert));
    }

    public static void main(String[] args) {
        int ersterWert = 5;
        int zweiterWert = 8;

        berechneSumme(ersterWert, zweiterWert);
    }
}