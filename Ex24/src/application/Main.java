package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo da viagem (em horas): ");
        double tempo = sc.nextDouble();

        System.out.print("Digite a velocidade média da viagem (km/h): ");
        double velocidade = sc.nextDouble();
        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12.0;

        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        System.out.printf("Litros de combustível utilizados: %.2f L%n", litrosUsados);

        sc.close();
    }
}
