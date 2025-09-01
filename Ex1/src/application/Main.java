package application;

import entities.Calculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores: ");
        System.out.print("A: ");
        int A = sc.nextInt();
        System.out.print("B: ");
        int B = sc.nextInt();
        System.out.print("C: ");
        int C = sc.nextInt();

        Calculo calc = new Calculo(A, B, C);
        if (calc.Soma() < C){
            System.out.println("A soma entre A e B " + "( " + (A + B) + " )" + " é menor que C " + "( " + C + " )");
        }
    }
}
