package homework.day7;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyScanner6 {
  // - читает текст из файла, считает в тексте количество символов и записывает результат в новый
  // файл,
  // имя которого строится по маске текущая_дата_время_количество.

  static int charQty = 0;

  public static void main(String[] args) {
    MyScanner6 myScanner6 = new MyScanner6();
    myScanner6.readFromFile();
    System.out.println(charQty);
    myScanner6.writeToFile();
    System.out.println(charQty);
    System.out.println();
  }

  public void readFromFile() {
    try {
      BufferedReader fileReader = new BufferedReader(new FileReader("output.txt"));
      String line = fileReader.readLine();

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

  public void writeToFile() {
    try {
      BufferedWriter fileWriter = new BufferedWriter(new FileWriter(generateFileName()));
      fileWriter.write(String.valueOf(charQty));
      fileWriter.close();
      System.out.println("Количество символов из файла успешно записана в новый файл.");
    } catch (IOException e) {
      System.out.println("Ошибка при записи в файл: " + e.getMessage());
    }
  }
  private String generateFileName() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
    String currentDateTime = dateFormat.format(new Date());
    return currentDateTime + "_" + charQty + ".txt";
  }
}


