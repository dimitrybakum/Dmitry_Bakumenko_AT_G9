package homework.day9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarsRunner {
  public static void main(String[] args) {

    Stream<String> cars = Stream.of("����", "����", "������", "����", "������", "������", "����");

    System.out.println("�������� � ������ ������ ���������� �������� ����");
    cars.distinct()
        .filter(string -> string.contains("�"))
        .skip(1)
        .map(String::toUpperCase)
        .forEach(System.out::println);
  }
}
