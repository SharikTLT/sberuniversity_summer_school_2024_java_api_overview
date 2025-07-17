package e4.utils;

import java.util.*;

//Структуры данных, коллекции
public class Part1_Collections {

    public static void main(String[] args) {
        list();
        set();
        map();
    }

    /**
     * Список, последовательность элементов
     */
    private static void list() {
        System.out.println("=== Список");
        List<String> stringList = new ArrayList<>();
        stringList.add("Первый");
        stringList.add("Второй");
        stringList.add("Третий");
        System.out.println(stringList);
        System.out.printf("Размер списка: %d %n", stringList.size());
        System.out.printf("Получаем второй элемент из списка: %s %n", stringList.get(1));

        System.out.println("Удаляем второй элемент");
        stringList.remove(1);
        System.out.println(stringList);
        System.out.printf("Размер списка: %d %n", stringList.size());

        System.out.printf("Получаем второй элемент из списка: %s %n", stringList.get(1));

        for (String element : stringList) {
            System.out.printf("Элемент списка: %s%n", element);
        }

        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
        }

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            //stringList.remove(element);
            ///
        }

        System.out.printf("%n%n%n");
    }

    /**
     * Множество, неупорядоченное множество уникальных элементов
     */
    private static void set() {
        System.out.println("=== Множество");

        Set<String> uniqueWords = new TreeSet<>(); // либо с явным указанием компаратора new TreeSet<>((a,b)->{ return -1/0/1; });

        setVerbose("Hello", uniqueWords);
        setVerbose("world", uniqueWords);
        setVerbose("Hello", uniqueWords);
        setVerbose("world", uniqueWords);
        setVerbose("b", uniqueWords);
        setVerbose("c", uniqueWords);
        setVerbose("a", uniqueWords);



        for (String uniqueWord : uniqueWords) {
            System.out.printf("Уникальное слово: %s%n", uniqueWord);
        }
        System.out.printf("%n%n%n");
    }

    private static void setVerbose(String word, Set<String> set){
        System.out.printf("Добавляем в множество слово '%s'%n", word);
        set.add(word);
        System.out.println(set);
        System.out.printf("Размер множества: %d %n", set.size());
    }

    /**
     * Словари, структура ключ-значение
     */
    private static void map() {
        System.out.println("=== Словарь");
        Map<String, Integer> recordTable = new HashMap<>(); //либо LinkedHashMap что бы запоминать порядок добавления

        recordTable.put("Иван", 20);
        recordTable.put("Василий", 30);
        recordTable.put("Елена", 90);
        System.out.println(recordTable);

        System.out.printf("Структура содержит ключ 'Иван': %s%n",recordTable.containsKey("Иван"));
        System.out.printf("Структура содержит ключ 'иван': %s%n",recordTable.containsKey("иван"));
        System.out.printf("Структура содержит значение '20': %s%n",recordTable.containsValue(20));
        System.out.printf("Структура содержит значение '21': %s%n",recordTable.containsValue(21));

        for (String key : recordTable.keySet()) {
            System.out.printf("Ключ %s%n", key);
        }
        for (Integer value : recordTable.values()) {
            System.out.printf("Значение %d%n", value);
        }

        for (Map.Entry<String, Integer> entry : recordTable.entrySet()) {
            System.out.printf("%s = %d%n", entry.getKey(), entry.getValue());
        }

    }
}
