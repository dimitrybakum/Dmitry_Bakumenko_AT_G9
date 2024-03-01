package homework.day9;

import homework.day8.pack.Water;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
  public static void main(String[] args) {
    Stream<Water> water1 =
        Stream.of(
            new Water("Прозрачная", "Нет"),
            new Water("Прозрачная", "Нет"),
            new Water("Мутная", "Аммиачный"),
            new Water("Синяя", "Мятный"));

    System.out.println("Отфильтровать воду, цвет которой не \"Прозрачная\"");
    water1.filter(water -> water.getColor() != "Прозрачная").forEach(System.out::println);

    Stream<Water> water2 =
        Stream.of(
            new Water("Прозрачная", "Нет"),
            new Water("Прозрачная", "Нет"),
            new Water("Мутная", "Аммиачный"),
            new Water("Синяя", "Мятный"));

    System.out.println("Отсортировать в нисходящем порядке по запаху");
    water2.map(Water::getSmell).sorted().forEach(System.out::println);

    Stream<Water> water3 =
        Stream.of(
            new Water("Прозрачная", "Нет"),
            new Water("Прозрачная", "Нет"),
            new Water("Мутная", "Аммиачный"),
            new Water("Синяя", "Мятный"));

    System.out.println(
        "На основании существующего потока данных создать новый,"
            + " в котором каждая новая Water имеет запах с удвоенной буквой ы, если такая встречается ");
    water3
        .map(
            water -> {
              String smell = water.getSmell();
              if (smell.contains("ы")) smell = smell.replace("ы", "ыы");
              return new Water(water.getColor(), smell);
            })
        .forEach(System.out::println);

    Stream<Water> water4 =
        Stream.of(
            new Water("Прозрачная", "Нет"),
            new Water("Прозрачная", "Нет"),
            new Water("Мутная", "Аммиачный"),
            new Water("Синяя", "Мятный"));

    System.out.println("Обьединить запах всех обьектов в одну строку");
    System.out.println(water4.map(Water::getSmell).collect(Collectors.joining()));

    Stream<Water> water5 =
        Stream.of(
            new Water("Прозрачная", "Нет"),
            new Water("Прозрачная", "Нет"),
            new Water("Мутная", "Аммиачный"),
            new Water("Синяя", "Мятный"));

    System.out.println("Найти количество буков в ней и отпечатаь в консоль");
    System.out.println(water5.map(Water::getSmell).collect(Collectors.joining()).length());
  }
}
