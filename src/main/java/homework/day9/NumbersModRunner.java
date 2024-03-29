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
                          return "����";
                        case '1':
                          return "����";
                        case '2':
                          return "���";
                        case '3':
                          return "���";
                        case '4':
                          return "������";
                        case '5':
                          return "����";
                        case '6':
                          return "�����";
                        case '7':
                          return "����";
                        case '8':
                          return "������";
                        case '9':
                          return "������";
                        default:
                          return "";
                      }
                    })
            .distinct()
            .forEach(System.out::println);
  }
}
