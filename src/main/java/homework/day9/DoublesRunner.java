package homework.day9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoublesRunner {
  public static void main(String[] args) {
    Stream<Double> doubles1 = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
    System.out.println("��������� ������ ����� �� ������");

    System.out.println(
        doubles1
            .mapToLong(Math::round)
            .boxed()
            .collect(Collectors.toList()));

//ToDo
    System.out.println("�� ��������� ����� ������ ������������� ����� ����� ������ " +
            "����� ����� �� ��������� ����� � ��������� �� 0 �� ����� �� �������� ������ ������");

//ToDo
    System.out.println("������ ��������� ��������");
    Stream<Double> doubles3 = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
//ToDo
    System.out.println(
        "�������� ������ ����� � ������������ ������ ������ ����� ������� ��������� �� �������� Bubble � ���������� ������� ����������� �����, �������� ������� � ������� ������ ����� �� ��������� ������ � ������ �� ����� \"Bubble vol-\" + i, ��� i - ����� �� ��������� ������\n");
    Stream<Double> doubles4 = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
//ToDo
    System.out.println("���������� � ������� ������ �� �������� ������ ������ � ����� ������");
    Stream<Double> doubles5 = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
//ToDo
    System.out.println("����� ����� ����� ����������� ������ ��������� � ���������� � �������");
    Stream<Double> doubles6 = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
  }
}
