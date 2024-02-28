package homework.day8;

import java.util.ArrayList;

public class Cities {
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>();
    cities.add("Минск");
    cities.add("Москва");
    cities.add("Берлин");

    System.out.println("Проитерировать список через for-each и отпечатать слова в консоль с новой строки");
    for (String city : cities) {
      System.out.println(city);
    }
    System.out.println();

    System.out.println("Посчитать сумму всех буков во всех словах и вывести число в консоль");
    int counter = 0;
    for (String city : cities) {
      counter += city.length();
    }
    System.out.println(counter);

    System.out.println("Проитерировать список по индексу и отпечатать слова в консоль через пробел");
    for (int i = 0; i < cities.size(); i++) {
      System.out.printf(cities.get(i) + " ");
    }
  }
}
