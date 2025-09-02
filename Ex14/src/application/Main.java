package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor A: ");
        int A = sc.nextInt();
        System.out.print("Digite o valor B: ");
        int B = sc.nextInt();
        int temp = A; A = B; B = temp;
        System.out.println("A: " + A);
        System.out.println("B: " + B);
    }
}
