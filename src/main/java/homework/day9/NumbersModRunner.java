package homework.day9;

import java.util.stream.Stream;

public class NumbersModRunner {
  public static void main(String[] args) {
    Stream<Integer> numbersMod1 = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
    numbersMod1.filter(num -> num.toString().contains("3"))
            .flatMapToInt(num -> num.toString().chars())
            .sorted()
            .mapToObj(
                    ch -> {
                      switch (ch) {
                        case '0':
                          return "ноль";
                        case '1':
                          return "один";
                        case '2':
                          return "два";
                        case '3':
                          return "три";
                        case '4':
                          return "четыре";
                        case '5':
                          return "пять";
                        case '6':
                          return "шесть";
                        case '7':
                          return "семь";
                        case '8':
                          return "восемь";
                        case '9':
                          return "девять";
                        default:
                          return "";
                      }
                    })
            .distinct()
            .forEach(System.out::println);
  }
}
