package homework.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Auto {
  // 4.
  public static void main(String[] args) {
      // Создать набор строк стрингов cars из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через new ArrayList)

      List<String> mySetItem = new ArrayList<>();

      String[] stringArr = "Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди".split(", ");

      for (String i : stringArr) {
          (mySetItem).add(i);
      }

      // Проитерировать список через for-each и отпечатать слова в файл cars через с новой строки в кавычках
      try (FileWriter fileWriter = new FileWriter("auto.txt")) {
          for (String auto : mySetItem) {
              fileWriter.write(STR."\'\{auto}\'\n");
          }
          System.out.println("авто были записаны в файл auto.txt");
      } catch (IOException e) {
          System.out.println("Ошибка при записи в файл: " + e.getMessage());
      }
      readFromFile();

      // Найти и удалить из набора авто, в названии которых больше 4 букв
      Iterator<String> iterator = mySetItem.iterator();
      while (iterator.hasNext()) {
          if(iterator.next().length() > 4){
              iterator.remove();
          }

      }
      System.out.println(mySetItem);

      // Проитерировать список через for-each и отпечатать слова в консоль через пробел
      System.out.println("~~!!!!!!!!!!!!!!!!");
      String str  = "";
      for (String i : mySetItem) {
          str  += i + " ";

      }
      System.out.println(str);
  }
    public static void readFromFile() {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("auto.txt"));
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
