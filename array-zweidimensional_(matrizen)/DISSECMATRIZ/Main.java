import java.util.Scanner;

public class Main {

    //Gesamte Matrix anzeigen
    public static void zeigeMatrix(int[][] matrix) {
        System.out.println("\nMATRIX:");
        for (int zeile = 0; zeile < 4; zeile++) {
            for (int spalte = 0; spalte < 4; spalte++) {
                System.out.printf("%4d", matrix[zeile][spalte]);
            }
            System.out.println();
        }
    }

    //Hauptdiagonale anzeigen
    public static void zeigeHauptdiagonale(int[][] matrix) {
        System.out.println("\nHAUPTDIAGONALE:");
        for (int zeile = 0; zeile < 4; zeile++) {
            for (int spalte = 0; spalte < 4; spalte++) {
                if (zeile == spalte) {
                    System.out.printf("%4d", matrix[zeile][spalte]);
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

    //Oberes Dreieck anzeigen (L < C im Visualg)
    public static void zeigeOberesDreieck(int[][] matrix) {
        System.out.println("\nOBERES DREIECK:");
        for (int zeile = 0; zeile < 4; zeile++) {
            for (int spalte = 0; spalte < 4; spalte++) {
                if (zeile < spalte) {
                    System.out.printf("%4d", matrix[zeile][spalte]);
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

    //Unteres Dreieck anzeigen (L > C im Visualg)
    public static void zeigeUnteresDreieck(int[][] matrix) {
        System.out.println("\nUNTERES DREIECK:");
        for (int zeile = 0; zeile < 4; zeile++) {
            for (int spalte = 0; spalte < 4; spalte++) {
                if (zeile > spalte) {
                    System.out.printf("%4d", matrix[zeile][spalte]);
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        int option = 0;

        //Erfassung der Matrixwerte
        for (int zeile = 0; zeile < 4; zeile++) {
            for (int spalte = 0; spalte < 4; spalte++) {
                System.out.print("Wert fuer Position [" + (zeile + 1) + "," + (spalte + 1) + "]: ");
                matrix[zeile][spalte] = tastatur.nextInt();
            }
        }

        //Hauptschleife des Menues
        do {
            System.out.println("\nOPTONENMENUE:");
            System.out.println("=======================");
            System.out.println("[1] Matrix anzeigen");
            System.out.println("[2] Hauptdiagonale anzeigen");
            System.out.println("[3] Oberes Dreieck anzeigen");
            System.out.println("[4] Unteres Dreieck anzeigen");
            System.out.println("[5] Beenden");
            System.out.print("==== OPTION: ");

            option = tastatur.nextInt();

            switch (option) {
                case 1:
                    zeigeMatrix(matrix);
                    break;
                case 2:
                    zeigeHauptdiagonale(matrix);
                    break;
                case 3:
                    zeigeOberesDreieck(matrix);
                    break;
                case 4:
                    zeigeUnteresDreieck(matrix);
                    break;
                case 5:
                    System.out.println("\nBEENDEN...");
                    break;
                default:
                    System.out.println("\nUngueltige Option!");
                    break;
            }

        } while (option != 5);

        tastatur.close();
    }
}