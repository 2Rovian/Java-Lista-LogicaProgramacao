package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua altura (Ex: 1.72): ");
        double altura = sc.nextDouble();
        System.out.print("Insira seu peso: (Ex: 76.5)");
        double peso = sc.nextDouble();

        double IMC = peso / (altura * altura);

        if(IMC < 18.5) {
            System.out.println("Abaixo do peso");
        } else if(IMC > 18.6 && IMC < 24.9) {
            System.out.println("Peso ideal (parabéns)");
        } else if (IMC > 25.0 && IMC < 29.9) {
            System.out.println("Levemente acima do peso");
        } else if(IMC > 30.0 && IMC < 34.9) {
            System.out.println("Obesidade grau I");
        } else if(IMC > 35.0 && IMC < 39.9) {
            System.out.println("Obesidade grau II");
        }

    }
}
