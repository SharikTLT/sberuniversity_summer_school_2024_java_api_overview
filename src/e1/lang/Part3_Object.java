package e1.lang;

/**
 * Методы класса Object
 */
public class Part3_Object {

    public static void main(String[] args) {
        final Object example = new Object();

        //Хэш объекта
        int hashCode = example.hashCode();
        System.out.println(hashCode);

        //Эквивалентность объектов
        boolean equalsResult = example.equals(example);
        System.out.println(equalsResult);

        //Текстовое представление
        String exampleAsString = example.toString();
        System.out.println(exampleAsString);

        //Получение класса объекта
        Class<?> exampleClass = example.getClass();
        System.out.println(exampleClass);


        //Вызывается сборщиком мусора для завершения очистки объекта из памяти
        //example.finalize();

        //Вызывается нативный код для клонирования объекта
        //example.clone();

    }
}
