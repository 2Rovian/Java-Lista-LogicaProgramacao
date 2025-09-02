package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();

        if (B != 0) {
            int quociente = A / B;
            int resto = A % B;

            System.out.println("Quociente da divisão: " + quociente);
            System.out.println("Resto da divisão: " + resto);
        } else {
            System.out.println("Erro: divisão por zero não é permitida.");
        }

        sc.close();
    }
}
