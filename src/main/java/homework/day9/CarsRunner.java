package homework.day9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarsRunner {
  public static void main(String[] args) {

    Stream<String> cars = Stream.of("����", "����", "������", "����", "������", "������", "����");
    System.out.println(Arrays.toString(cars.toArray()));

    System.out.println("�������� � ������ ������ ���������� �������� ����");
    Stream<String> cars2 = Stream.of("����", "����", "������", "����", "������", "������", "����");
    System.out.println(cars2.distinct().collect(Collectors.joining(" ")));

    System.out.println("������������� ������ �� ��������, ������� �������� ����� \"�\"");
    Stream<String> cars3 = Stream.of("����", "����", "������", "����", "������", "������", "����");
    System.out.println(cars3.filter(string -> string.contains("�")).collect(Collectors.joining(" ")));

    System.out.println("���������� 1 ��������");
    Stream<String> cars4 = Stream.of("����", "����", "������", "����", "������", "������", "����");
    System.out.println(cars4.skip(1).collect(Collectors.joining(" ")));

    System.out.println("��� �������� �������� � ������� �������");
    Stream<String> cars5 = Stream.of("����", "����", "������", "����", "������", "������", "����");
    System.out.println(cars5.map(String::toUpperCase).collect(Collectors.toList()));

    System.out.println("���������� ��� �������� � ������� � ����� ������");
    Stream<String> cars6 = Stream.of("����", "����", "������", "����", "������", "������", "����");
    cars6.map(String::new).peek((e) -> System.out.print(e + "\n")).collect(Collectors.toList());
  }
}
