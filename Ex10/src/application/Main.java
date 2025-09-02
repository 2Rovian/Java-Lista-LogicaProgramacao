package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double segundaNota = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double terceiraNota = sc.nextDouble();

        double media = ( primeiraNota + segundaNota + terceiraNota ) / 3;
        System.out.println("A média é " + media);
    }
}
