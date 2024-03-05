package homework.day9;

import homework.day8.pack.Bubble;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BubblesRunner {
  public static void main(String[] args) {
    System.out.println("В потоке данных отфильтровать только те пузыри, объем которых больше 3");
    System.out.println("Отсортировать данные по имени в восходящем порядке");
    System.out.println(
        "На основании существующего потока данных создать новый, "
            + "в котором каждый новый Bubble имеет обьем в 3 раза больше исходного");

    List<Bubble> bubbles =
        Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

    Stream<Bubble> streamBubbles = bubbles.stream();

    streamBubbles
        .mapToInt(Bubble::getVolume)
        .filter(e -> e > 3)
        .map(e -> e * 3)
        .forEach(System.out::println);
  }
}
