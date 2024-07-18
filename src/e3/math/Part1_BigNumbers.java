package e3.math;


import java.math.BigDecimal;

//Большие числа
public class Part1_BigNumbers {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(Long.MAX_VALUE);

        System.out.printf("Максимальное значение Long типа = %s %n", bigDecimal);
        System.out.printf("Максимальное значение Long типа в кубе = %s %n", bigDecimal.pow(3));

        BigDecimal onePointOne = new BigDecimal(0.1).setScale(3, BigDecimal.ROUND_HALF_UP);

        bigDecimal = new BigDecimal(1).setScale(3, BigDecimal.ROUND_HALF_UP)
                .subtract(onePointOne)
                .subtract(onePointOne)
        ;

        BigDecimal second = new BigDecimal(0.8).setScale(3, BigDecimal.ROUND_HALF_UP);
        System.out.printf("1 - 0.1 - 0.1 = %s %n", bigDecimal);
        System.out.printf("Второе число = %s %n", second);
        System.out.printf("Первое число эквивалентно второму: %s %n", bigDecimal.compareTo(second));
    }
}
