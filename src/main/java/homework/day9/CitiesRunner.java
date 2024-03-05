package homework.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CitiesRunner {

  public static void main(String[] args) {

    System.out.println("Создать пустой список стрингов cities (через new ArrayList)");
    List<String> cities = new ArrayList<>();

    System.out.println("Добавить в список 3 города (Минск, Москва, Берлин)");
    cities.add("Минск");
    cities.add("Москва");
    cities.add("Берлин");

    System.out.println("Посчитать сумму всех буков во всех словах и вывести число в консоль");
    System.out.println(cities.stream().collect(Collectors.joining()).length());
  }
}
