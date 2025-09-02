package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada de 1 até 10");
        System.out.print("Escolha | Soma(1) / Subtração(2) / Multiplicação(3) / Divisão(4): ");
        int escolha = sc.nextInt();

        if(escolha == 1) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println( i + " + " + j + " = " + (i + j));
                }
            }
        } else if (escolha == 2) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println( i + " - " + j + " = " + (i - j));
                }
            }
        } else if (escolha == 3) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println( i + " x " + j + " = " + (i * j));
                }
            }
        } else if (escolha == 4) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println( i + " / " + j + " = " + (i / j));
                }
            }
        }
        sc.close();
    }
}
