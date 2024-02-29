package homework.day9;

import java.util.stream.Stream;

public class ElementsRunner {
  public static void main(String[] args) {
    Stream<String> elements =
        Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");

    System.out.println(
        "Для каждого элемента стрима пробежаться по отдельным словам и если слово нечетное, то заменить в нем все буквы \"e\" на букву \"o\", а если четное, то заменить слово на числоколичества буков в этом слове");

    elements
        .flatMap(str -> Stream.of(str.split("[\\s-]+")))
        .map(
            word -> {
              if (word.length() % 2 != 0) {
                return word.replaceAll("e", "o");
              } else {
                return String.valueOf(word.length());
              }
            })
        .forEach(System.out::println);

    // ToDo Оставить в потоке только уникальные значения

    // ToDo Отпечатать в консоль с новой строки
  }
}
