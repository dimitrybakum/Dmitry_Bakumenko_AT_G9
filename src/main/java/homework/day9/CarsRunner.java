package homework.day9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarsRunner {
  public static void main(String[] args) {

    Stream<String> cars = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");
    System.out.println(Arrays.toString(cars.toArray()));

    System.out.println("Оставить в потоке только уникальные названия авто");
    Stream<String> cars2 = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");
    System.out.println(cars2.distinct().collect(Collectors.joining(" ")));

    System.out.println("Отфильтровать только те названия, которые содержат букву \"и\"");
    Stream<String> cars3 = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");
    System.out.println(cars3.filter(string -> string.contains("и")).collect(Collectors.joining(" ")));

    System.out.println("Пропустить 1 название");
    Stream<String> cars4 = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");
    System.out.println(cars4.skip(1).collect(Collectors.joining(" ")));

    System.out.println("Все названия привести в верхний регистр");
    Stream<String> cars5 = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");
    System.out.println(cars5.map(String::toUpperCase).collect(Collectors.toList()));

    System.out.println("Отпечатать все названия в консоль с новой строки");
    Stream<String> cars6 = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");
    cars6.map(String::new).peek((e) -> System.out.print(e + "\n")).collect(Collectors.toList());
  }
}
