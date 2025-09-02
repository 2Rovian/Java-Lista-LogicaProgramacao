package application;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        System.out.print("Valor 1:  ");
        numbers.add(sc.nextInt());
        System.out.print("Valor 2:  ");
        numbers.add(sc.nextInt());
        System.out.print("Valor 3:  ");
        numbers.add(sc.nextInt());

        Collections.sort(numbers);
        for(Integer number : numbers) {
            System.out.println(number);
        }
    }
}
