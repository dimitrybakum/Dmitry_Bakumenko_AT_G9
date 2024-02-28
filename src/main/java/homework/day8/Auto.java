package homework.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static homework.day8.FileReader.readFromFile;


public class Auto {
  public static void main(String[] args) {
      System.out.println("Создать набор строк стрингов cars из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через new ArrayList)");

      List<String> carList = new ArrayList<>();
      carList.add("Мерс");
      carList.add("Ауди");
      carList.add("Жигуль");
      carList.add("Рено");
      carList.add("Жигуль");
      carList.add("Жигуль");
      carList.add("Ауди");


      System.out.println("Проитерировать список через for-each и отпечатать слова в файл cars через с новой строки в кавычках");
      try (FileWriter fileWriter = new FileWriter("cars.txt")) {
          for (String car : carList) {
              fileWriter.write(STR."\'\{car}\'\n");
          }
          System.out.println("авто были записаны в файл auto.txt");
      } catch (IOException e) {
          System.out.println("Ошибка при записи в файл: " + e.getMessage());
      }
      readFromFile("cars.txt");


      System.out.println("Найти и удалить из набора авто, в названии которых больше 4 букв");
      Iterator<String> iterator = carList.iterator();
      while (iterator.hasNext()) {
          if(iterator.next().length() > 4){
              iterator.remove();
          }

      }
      System.out.println(carList);


      System.out.println("Проитерировать список через for-each и отпечатать слова в консоль через пробел");
      String str  = "";
      for (String car : carList) {
          str  += car + " ";
      }
      System.out.println(str);
  }
}
