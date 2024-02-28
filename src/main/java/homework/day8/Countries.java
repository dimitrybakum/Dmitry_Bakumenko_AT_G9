package homework.day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Countries {
  public static void main(String[] args) {

    List<String> countries = new ArrayList<>();
    countries.add("Андора");
    countries.add("Португалия");
    countries.add("Англия");
    countries.add("Замбия");

    System.out.println("Проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом");
    for (String s : countries) {
      System.out.printf(s + ", ");
    }
    System.out.println();

    System.out.println("Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль");
    Iterator<String> iterator = countries.iterator();
    int counter = 0;
    while (iterator.hasNext()) {
      if (iterator.next().length() < 7) {
        counter++;
      }
    }
    System.out.println(counter);
    System.out.println();

    System.out.println("Проитерировать список по индексу и отпечатать слова в консоль с новой строки");
    for (int i = 0; i < countries.size(); i++) {
      System.out.println(countries.get(i));
    }
  }
}
