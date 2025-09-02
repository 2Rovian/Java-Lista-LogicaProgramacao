package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor (true/false): ");
        boolean valor1 = sc.nextBoolean();

        System.out.print("Digite o segundo valor (true/false): ");
        boolean valor2 = sc.nextBoolean();

        if (valor1 && valor2) {
            System.out.println("Ambos são VERDADEIROS");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos são FALSOS");
        } else {
            System.out.println("São diferentes (um verdadeiro e outro falso)");
        }

        sc.close();
    }
}
