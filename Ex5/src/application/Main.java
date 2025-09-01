package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salarioUsuario = sc.nextDouble();
        double salarioMinimo = 1293.2;
        System.out.println("O usuário ganha " + String.format("%.2f" ,(salarioUsuario / salarioMinimo)) + " de salários mínimos");
    }
}
