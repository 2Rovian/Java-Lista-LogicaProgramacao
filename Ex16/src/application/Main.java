package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado A: ");
        int ladoA = sc.nextInt();
        System.out.print("Lado B: ");
        int ladoB = sc.nextInt();
        System.out.print("Lado C: ");
        int ladoC = sc.nextInt();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triângulo Equilátero");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Triângulo inválido");
        }

        sc.close();
    }
}
