package homework.day8;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import static homework.day8.FileReader.readFromFile;

public class Figures {
  public static void main(String[] args) throws IOException {

    List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

    System.out.println("Проитерировать список через for-each и отпечатать слова в файл figures через тире");
    try (FileWriter fileWriter = new FileWriter("figures.txt")) {
      for (String figure : figures) {
        fileWriter.write(figure + "-");
      }
      System.out.println("Фигуры были записаны в файл figures.txt");
    } catch (IOException e) {
      System.out.println("Ошибка при записи в файл: " + e.getMessage());
    }
    readFromFile("figures.txt");

    System.out.println("Посчитать сколько фигур НЕ содержат букву \"и\" и вывести число в консоль");
    int count = 0;
    for (String figure : figures) {
      if (!figure.toLowerCase().contains("и")) {
        count++;
      }
    }
    System.out.println("Количество фигур, не содержащих букву 'и': " + count);

    System.out.println("Проитерировать список по индексу и отпечатать слова в консоль через пробел");
    for (int i = 0; i < figures.size(); i++) {
      System.out.printf(figures.get(i) + " ");
    }
    System.out.println();

    System.out.println("Вставить на 3 позицию Треугольник");
    // ToDo
    // figures.add(2, "Треугольник");
    // System.out.println(figures);

    System.out.println("Проитерировать список через for-each и отпечатать слова в консоль через пробел");
    for (String figure : figures) {
      System.out.printf(figure + " ");
    }
  }
}
