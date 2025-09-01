package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = sc.nextInt();
        int c;

        if(primeiroNumero == segundoNumero) {
            c =  primeiroNumero + segundoNumero;
            System.out.printf("A soma entre %d e %d é igual a %d", primeiroNumero, segundoNumero, c);
        } else {
            c = primeiroNumero * segundoNumero;
            System.out.printf("A multiplicação entre %d e %d é igual a %d", primeiroNumero, segundoNumero, c);
        }
    }
}
