package application;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int anos = 0;
        while (alturaFrancisco >= alturaSara) {
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            anos++;
        }
        System.out.println("Passaram se " + anos + " anos");
    }
}
