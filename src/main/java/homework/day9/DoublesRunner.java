package homework.day9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoublesRunner {
  public static void main(String[] args) {
    Stream<Double> doubles1 = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
    System.out.println("ќкруглить каждое число до целого");

    System.out.println(
        doubles1
            .mapToLong(Math::round)
            .boxed()
            .collect(Collectors.toList()));

//ToDo
    System.out.println("Ќа основании этого потока сгенерировать новый поток данных " +
            "целых чисел из случайных чисел с границами от 0 до числа из иходного потока данных");

//ToDo
    System.out.println("”брать дубликаты значений");
    Stream<Double> doubles3 = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
//ToDo
    System.out.println(
        "«аменить каждое число в получившемс€ потоке данных новым потоком состо€щим из обьектов Bubble в количестве равному замен€емому числу, создава€ обьекты с обьемом равным числу из исходного потока и именем по маске \"Bubble vol-\" + i, где i - число из исходного потока\n");
    Stream<Double> doubles4 = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
//ToDo
    System.out.println("ќтпечатать в консоль каждый из обьектов нового потока с новой строки");
    Stream<Double> doubles5 = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
//ToDo
    System.out.println("Ќайти общий обьем полученного потока пузырьков и отпечатать в консоль");
    Stream<Double> doubles6 = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
  }
}
