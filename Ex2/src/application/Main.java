package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = sc.nextInt();


        if(number % 2 == 0){
            System.out.println("O número " + number + " é par");
        } else{
            System.out.println("O número " + number + " é impar");
        }

        if(number > 0) {
            System.out.println("O número " + number + " é positivo");
        } else if(number == 0) {
            System.out.println("O número " + number + " é igual a 0");
        } else {
            System.out.println("O número " + number + " é negativo");
        }
    }
}
