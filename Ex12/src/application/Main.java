package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insria o valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.println("Como gostaria de comprar? ");
        System.out.println("À Vista em Dinheiro ou Pix, recebe 15% de desconto ( digite: 1 )");
        System.out.println("À Vista no cartão de crédito, recebe 10% de desconto ( digite: 2 )");
        System.out.println("Parcelado no cartão em duas vezes, preço normal do produto sem juros ( digite: 3 )");
        System.out.println("Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10% ( digite: 4 )");
        int formaPagamento = sc.nextInt();

        if (formaPagamento == 1) {
            System.out.println("Valor: " + valorProduto * 0.85);
        } else if(formaPagamento == 2) {
            System.out.println("Valor " + valorProduto * 0.90);
        } else if(formaPagamento == 3) {
            System.out.println("Valor " + valorProduto);
        } else if(formaPagamento == 4) {
            System.out.println("Valor " + valorProduto * 1.10);
        }

        sc.close();
    }
}
