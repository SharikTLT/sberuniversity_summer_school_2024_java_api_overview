package e2.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Работа с стандартным потоком ввода\вывода
public class Part1_Console {

    public static void main(String[] args) throws IOException {
        //System.in - стандартный поток ввода
        //System.out - стандартный поток вывода

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("What`s your name?");
        String name = bufferedReader.readLine();

        System.out.printf("Hello %s!", name);

    }
}
