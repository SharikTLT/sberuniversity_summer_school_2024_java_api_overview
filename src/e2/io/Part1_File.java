package e2.io;

import java.io.*;

//Работа с файлами
public class Part1_File {

    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");

        try (
                InputStreamReader reader = new FileReader(file);
                BufferedReader br = new BufferedReader(reader);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.printf("Считана строка: %s%n", line);
            }
        }

        File outFile = new File("output.txt");
        if (outFile.exists()) {
            outFile.delete();
        }
        try (PrintStream printStream = new PrintStream(outFile)){
            printStream.println("Hello");
            printStream.println("world!");
        }


        File projectDirectory = file.getAbsoluteFile().getParentFile();
        System.out.printf("Листинг директории: %s %n", projectDirectory.getPath());
        for (File childFile : projectDirectory.listFiles()) {
            System.out.printf(
                    "%-30s %-11s %d %n",
                    childFile.getName(),
                    childFile.isDirectory() ? "директория" : "файл",
                    childFile.length()
            );
        }

    }
}
