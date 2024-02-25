package homework.day8;

import homework.day5.playground.essence.craft.field.types.Car;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Figures {
  // 2.

  public static void main(String[] args) throws IOException {
    // Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс)
    // через (Arrays.asList())

    List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

    // Проитерировать список через for-each и отпечатать слова в файл figures через тире
    try (FileWriter fileWriter = new FileWriter("figures.txt")) {
      for (String figure : figures) {
        fileWriter.write(figure + "-");
      }
      System.out.println("Фигуры были записаны в файл figures.txt");
    } catch (IOException e) {
      System.out.println("Ошибка при записи в файл: " + e.getMessage());
    }
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    readFromFile();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
    int count = 0;
    for (String f : figures) {
      if (!f.toLowerCase().contains("и")) {
        count++;
      }
    }
    System.out.println("Количество фигур, не содержащих букву 'и': " + count);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // Проитерировать список по индексу и отпечатать слова в консоль через пробел
    String resultString = "";
    for (String i : figures) {
      resultString += i + " ";
    }
    System.out.printf(resultString).println();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // Вставить на 3 позицию Треугольник
    String triangle = "Треугольник";
    figures.set(2, triangle);
    System.out.println(figures);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // Проитерировать список через for-each и отпечатать слова в консоль через пробел
    String resultString2 = "";
    for (String f : figures) {
      resultString2 += f + " ";
    }

    System.out.println(resultString2);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  }

  public static void readFromFile() {
    try {
      BufferedReader fileReader = new BufferedReader(new FileReader("figures.txt"));
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
