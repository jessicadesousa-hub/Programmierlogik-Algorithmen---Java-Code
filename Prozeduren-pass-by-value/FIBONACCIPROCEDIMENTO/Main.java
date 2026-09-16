public class Main {

    public static int berechneNaechsteFibonacci(int ersterWert, int zweiterWert) {
        return ersterWert + zweiterWert;
    }

    public static void main(String[] args) {
        int ersterWert = 0;
        int zweiterWert = 1;

        System.out.print(ersterWert + " ");
        System.out.print(zweiterWert + " ");

        for (int zaehler = 3; zaehler <= 10; zaehler++) {
            int naechsterWert = berechneNaechsteFibonacci(ersterWert, zweiterWert);
            System.out.print(naechsterWert + " ");

            // Atualiza os valores para a proxima iteracao
            ersterWert = zweiterWert;
            zweiterWert = naechsterWert;
        }
        System.out.println();
    }
}