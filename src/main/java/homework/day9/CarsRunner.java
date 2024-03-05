package homework.day9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarsRunner {
  public static void main(String[] args) {

    Stream<String> cars = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");

    System.out.println("Оставить в потоке только уникальные названия авто");
    cars.distinct()
        .filter(string -> string.contains("и"))
        .skip(1)
        .map(String::toUpperCase)
        .forEach(System.out::println);
  }
}
