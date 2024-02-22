package homework.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyScanner5 {
  // - читает текст из файла, считает в тексте количество символов и выводит результат в консоль.
  public static void main(String[] args) {
    MyScanner5 myScanner5 = new MyScanner5();
    myScanner5.readFromFile();
  }

  public void readFromFile() {
    try {
      BufferedReader fileReader = new BufferedReader(new FileReader("output.txt"));
      String line = fileReader.readLine();
      int charQty = 0;
      while (line != null) {
        charQty += line.length();
        line = fileReader.readLine();
      }
      System.out.println("Количество символов в файле: " + charQty);
      fileReader.close();
    } catch (IOException e) {
      System.out.println("Ошибка при чтении из файла: " + e.getMessage());
    }
  }
}
