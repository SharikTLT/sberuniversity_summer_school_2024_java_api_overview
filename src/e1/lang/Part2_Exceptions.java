package e1.lang;

/**
 * Исключения
 */
public class Part2_Exceptions {

    public static void main(String[] args) {
        try {
            if (true) {
                throw new RuntimeException("Выброшенное рантайм исключение");
            }
            System.out.println("То что не будет выполнено");
        } catch (Throwable e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
}
