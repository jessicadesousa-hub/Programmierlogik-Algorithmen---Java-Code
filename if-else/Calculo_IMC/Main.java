import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        double gewicht;
        double groesse;
        double bmi;

        System.out.print("Wie viel wiegen Sie (in kg)? ");
        gewicht = tastatur.nextDouble();

        System.out.print("Wie gross sind Sie (in Metern)? ");
        groesse = tastatur.nextDouble();

        bmi = gewicht / (groesse * groesse);

        System.out.printf("BMI: %.2f%n", bmi);

        if (bmi < 17.0) {
            System.out.println("Starkes Untergewicht");
        } else if (bmi < 18.5) {
            System.out.println("Untergewicht");
        } else if (bmi < 25.0) {
            System.out.println("Normalgewicht");
        } else if (bmi < 30.0) {
            System.out.println("Uebergewicht");
        } else if (bmi < 35.0) {
            System.out.println("Adipositas Grad I");
        } else if (bmi < 40.0) {
            System.out.println("Starke Adipositas (Grad II)");
        } else {
            System.out.println("Extrem schwere Adipositas (Grad III)");
        }

        tastatur.close();
    }
}