package homework.day9;

import homework.day8.pack.Bubble;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoublesRunner {
  public static void main(String[] args) {
    Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
    doubles
        .mapToLong(Math::round)
        .boxed()
        .map(num -> new Random().nextInt(0, Math.toIntExact(num) + 1))
            .distinct()
            .flatMap(num -> IntStream.range(0, num).mapToObj(_ -> new Bubble(num, "Bubble vol-" + num)))
        .forEach(System.out::println);

    System.out.println("Найти общий обьем полученного потока пузырьков и отпечатать в консоль");
  }
}
