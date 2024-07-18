package e1.lang;

import static java.lang.Math.*;

/**
 * Базовые математические функции: экспонента, логарифм и тригонометрические функции
 */
public class Part5_Math {
    public static void main(String[] args) {
        //java.lang.Math класс с статическими математическими функциями с оптимизациями и потерей точности
        //java.lang.StrictMath нативная реализация математических операций в операционной системе или микропроцессоре

        System.out.printf("Константа числа Пи: %s %n", Math.PI);
        System.out.printf("Константа Эйлера: %s %n", Math.E);

        System.out.printf("2 в степени 16 = %s %n", pow(2, 16));

        System.out.printf("Число Эйлера в степени 3 = %s %n", exp(3));

        System.out.printf("Логарифм 10 по основанию 10 = %s %s %n", log10(100), "asd");
        System.out.printf("Натуральный логарифм 0.5 = %s %n", log(0.5));
        System.out.printf("Натуральный логарифм 0.5 + 1 = %s %n", log1p(0.5));

        System.out.printf("Косинус 90 градусов = %s %n", cos(PI/2));
        System.out.printf("Косинус 180 градусов = %s %n", cos(PI));

    }
}
