package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da hora-aula: ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite o número de aulas no mês: ");
        int aulasMes = sc.nextInt();

        System.out.print("Digite o percentual de desconto do INSS (%): ");
        double descontoINSS = sc.nextDouble();

        double salarioBruto = valorHora * aulasMes;
        double valorDesconto = salarioBruto * (descontoINSS / 100);
        double salarioLiquido = salarioBruto - valorDesconto;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS: R$ %.2f%n", valorDesconto);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}
