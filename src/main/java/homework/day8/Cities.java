package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cities {
  // Создать пустой список стрингов cities (через new ArrayList)

  public static void main(String[] args) {

    ArrayList<String> cities = new ArrayList<>();
    cities.add("Минск");
    cities.add("Москва");
    cities.add("Берлин");
    System.out.println(cities);
    for (String city : cities) {
      System.out.println(city);
    }
    int counter = 0;
    for (String city : cities) {
      counter += city.length();
    }
    System.out.println(counter);
    String str = "";
    for (int i = 0; i < cities.size(); i++) {
      str += cities.get(i) + " ";
    }
    System.out.println(str);
  }
  // Добавить в список 3 города (Минск, Москва, Берлин)
  // Проитерировать список через for-each и отпечатать слова в консоль с новой строки
  // Посчитать сумму всех буков во всех словах и вывести число в консоль
  // Проитерировать список по индексу и отпечатать слова в консоль через пробел
}
