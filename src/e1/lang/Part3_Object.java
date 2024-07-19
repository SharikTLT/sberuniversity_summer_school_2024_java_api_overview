package e1.lang;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

        Person p = new Person("ПримерИмени");

        //Текстовое представление
        String exampleAsString = example.toString();
        System.out.println(exampleAsString);

        //Получение класса объекта
        Class<?> exampleClass = example.getClass();
        try {
            Method toString = exampleClass.getDeclaredMethod("toString");
            toString.invoke(p);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(exampleClass);


        //Вызывается сборщиком мусора для завершения очистки объекта из памяти
        //example.finalize();

        //Вызывается нативный код для клонирования объекта
        //example.clone();

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
