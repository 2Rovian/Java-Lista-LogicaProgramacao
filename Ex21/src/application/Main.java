package application;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int valor = random.nextInt(101);

        System.out.println("Valor aleatório entre 0 e 100: " + valor);
    }
}
