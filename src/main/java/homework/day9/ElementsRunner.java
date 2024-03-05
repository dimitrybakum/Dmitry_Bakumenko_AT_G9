package homework.day9;

import java.util.stream.Stream;

public class ElementsRunner {
  public static void main(String[] args) {
    Stream<String> elements =
        Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");

    elements
        .flatMap(str -> Stream.of(str.split("[\\s-]+")))
        .map(
            word -> {
              if (word.length() % 2 != 0) {
                return word.replaceAll("e", "o");
              } else {
                return String.valueOf(word.length());
              }
            }).distinct()
        .forEach(System.out::println);
  }
}
