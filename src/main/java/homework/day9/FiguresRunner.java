package homework.day9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiguresRunner {
  public static void main(String[] args) {

    System.out.println(
        "������� ������ ����� �������� figures �� 5 ����� (����, �������������,����, �������, ������) ����� (Stream.of())");
    Stream<String> figures = Stream.of("����", "�������������", "����", "�������", "������");
    System.out.println(figures.collect(Collectors.toList()));

    System.out.println(
        "�������� ������ ����� �� ����� �����, ��������������� ���������� ����� ������");
    Stream<String> figures2 = Stream.of("����", "�������������", "����", "�������", "������");
    System.out.println(figures2.map(String::length).collect(Collectors.toList()));

    System.out.println("������������� �����, ������� ������ 4");
    Stream<String> figures3 = Stream.of("����", "�������������", "����", "�������", "������");
    System.out.println(
        figures3.map(String::length).filter(s -> s > 4).collect(Collectors.toList()));

    System.out.println("���������� ��� ���������� ����� � �������");
    Stream<String> figures4 = Stream.of("����", "�������������", "����", "�������", "������");
    System.out.println(
        figures4.map(String::length).filter(s -> s <= 4).collect(Collectors.toList()));
  }
}
