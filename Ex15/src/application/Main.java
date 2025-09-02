package application;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();
        System.out.print("Digite o ano em que você nasceu: ");
        int anoNascimento = sc.nextInt();
        int anosVividos = anoAtual - anoNascimento;
        int diasTotais = anosVividos * 365;
        int anos = diasTotais / 365;
        int resto = diasTotais % 365;
        int meses = resto / 30;
        int dias = resto % 30;
        System.out.printf("Você viveu aproximadamente %d anos, %d meses e %d dias.%n",
                anos, meses, dias);

        sc.close();
    }
}
