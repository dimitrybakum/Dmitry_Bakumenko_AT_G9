package homework.day9;

import java.util.stream.Stream;

public class NumbersRunner {
  public static void main(String[] args) {
    Stream<Integer> streamNumbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);
    System.out.println(
        "� ������ ������ �������������� ����� � ���������� ����� � ������� ����� ������");
    streamNumbers.forEach(System.out::println);

    System.out.println("������������� � ����� ���������� � ������� � ����� ������");
    Stream<Integer> streamNumbers2 = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);
    streamNumbers2.sorted().forEach(System.out::println);


    System.out.println("��������� ����� ���� ����� � ������� ��������� � �������");
    // ToDo
  }
}
