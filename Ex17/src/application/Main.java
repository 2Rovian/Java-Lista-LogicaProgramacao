package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (5 * ( fahrenheit-32) / 9);
        System.out.println(celsius + "celsius = " + fahrenheit + "fahrenheit");
        sc.close();
    }
}
