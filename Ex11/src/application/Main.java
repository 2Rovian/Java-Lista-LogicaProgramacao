package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.next();
        System.out.print("Primeira nota: ");
        double primeiraNota = sc.nextDouble();
        System.out.print("Segunda nota: ");
        double segundaNota = sc.nextDouble();
        System.out.print("Terceira nota: ");
        double terceiraNota = sc.nextDouble();
        System.out.print("Quarta nota: ");
        double quartaNota = sc.nextDouble();
        double resultado = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        if(resultado >= 7.0) {
            System.out.println("O aluno " + nome + " está aprovado!");
        } else {
            System.out.println("O aluno " + nome + " está reprovado");
        }

        sc.close();
    }
}
