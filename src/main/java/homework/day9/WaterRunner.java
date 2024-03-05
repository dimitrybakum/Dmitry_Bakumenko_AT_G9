package homework.day9;

import homework.day8.pack.Water;

import java.util.Comparator;
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

    System.out.println(
        water1
            .filter(water -> water.getColor() != "Прозрачная")
            .sorted(Comparator.comparing(Water::getSmell).reversed())
            .map(
                water -> {
                  String smell = water.getSmell();
                  if (smell.contains("ы")) smell = smell.replace("ы", "ыы");
                  return new Water(water.getColor(), smell);
                })
            .map(Water::getSmell)
            .collect(Collectors.joining())
            .length());
  }
}
