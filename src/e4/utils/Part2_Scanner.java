package e4.utils;

import java.util.Scanner;

//Считывание типов
public class Part2_Scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа (0 - выход)");

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.printf("Ввели число: %d%n", n);
            if(n == 0){
                break;
            }
        }
    }
}
