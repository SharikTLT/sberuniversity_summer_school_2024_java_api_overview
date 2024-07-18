package e1.lang;

/**
 * Методы класса Object для многопоточности
 */
public class Part3_Object_SyncMethods {


    public static void main(String[] args) {

        // wait() - ожидать сигнала
        // notify() - подать сигнал 1 случайному ожидающему потоку
        // notifyAll() - подать сигнал всем ожидающим потокам

        final Object example = new Object();


        Thread thread = new Thread(() -> {
            print("Дочерний поток запущен");
            synchronized (example) {
                print("Уведомляем основной поток");
                //Разбудить случайный ожидающий поток
                example.notify();

                try {
                    //Ожидать сигнала от потока
                    print("Ждем ответа от основного потока");
                    example.wait();

                    print("Сигнал от основного потока получен");
                } catch (InterruptedException e) {
                    print("Поток был прерван");
                }
            }
        });
        thread.start();
        try {
            synchronized (example) {
                print("Ждем ответа от дочернего потока");
                example.wait();
                print("Дождались, пока дочерний поток запустится и подаст сигнал");
                //Разбудить все ожидающие потоки
                example.notifyAll();
            }
        } catch (InterruptedException e) {
            print("Основной поток был прерван");
        }
        print("Основной поток завершен");
    }

    private static void print(String message) {
        System.out.printf("[%s] %s%n", Thread.currentThread().getName(), message);
    }
}
