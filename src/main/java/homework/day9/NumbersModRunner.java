package homework.day9;

import java.util.stream.Stream;

public class NumbersModRunner {
  public static void main(String[] args) {
    Stream<Integer> numbersMod1 = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
    System.out.println("Отфильтровать те числа, которые содержать цифру 3");
    numbersMod1.filter(num -> num.toString().contains("3")).forEach(System.out::println);

    System.out.println(
        "Разбить числа на отдельные цифры и заменить цифры соответствующими словами");
    Stream<Integer> numbersMod2 = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
    numbersMod2
        .flatMapToInt(num -> num.toString().chars())
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
        .forEach(System.out::println);

    System.out.println(
        "Оставить только уникальные слова, отсортировать в нисходящем порядке и отпечатать в консоль с новой строки");
    Stream<Integer> numbersMod3 = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
    numbersMod3
        .flatMapToInt(num -> num.toString().chars())
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
