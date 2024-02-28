package homework.day8;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args){

    }

    public static void readFromFile(String string) {
        try {
            BufferedReader fileReader = new BufferedReader(new java.io.FileReader(string));
            String line = fileReader.readLine();
            while (line != null) {
                System.out.println("fileReader: " + line);
                line = fileReader.readLine();
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
        }
    }
}
