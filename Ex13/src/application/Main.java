package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.next();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if(idade >= 18) {
            System.out.println("O " + nome + " é maior de idade");
        } else {
            System.out.println("O " + nome + " é menor de idade");
        }

        sc.close();
    }
}
