package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numero = sc.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.printf("O número %d tem antecessor %d e sucessor %d", numero, antecessor, sucessor);
    }

}
