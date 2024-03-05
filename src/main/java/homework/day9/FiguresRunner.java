package homework.day9;

import java.util.stream.Stream;

public class FiguresRunner {
  public static void main(String[] args) {

    Stream<String> figures = Stream.of("����", "�������������", "����", "�������", "������");

    figures.map(String::length).filter(s -> s <= 4).forEach(System.out::println);
  }
}
