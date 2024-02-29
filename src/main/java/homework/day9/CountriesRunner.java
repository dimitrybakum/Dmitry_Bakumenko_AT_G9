package homework.day9;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountriesRunner {
  public static void main(String[] args) {

    System.out.println("������� ����� ������ �������� countries �� 4 ����� (������, ����������, ������, ������)(����� Stream.of())");
    Stream<String> countries = Stream.of("������", "����������", "������", "������");

    System.out.println("������������� ������, ������� �������� � ���� ���� �� ���� ������� �����");
    System.out.println(countries.filter(string -> Pattern.compile("[����������������]").matcher(string).find()).collect(Collectors.joining("\n")));

    System.out.println("������������� ������, � �������� ������� ������ 7 ����");
    Stream<String> countries2 = Stream.of("������", "����������", "������", "������");
    System.out.println(countries2.filter(string -> string.length() < 7).toList());

    System.out.println("��������� ��� ������ � ������� �������");
    Stream<String> countries3 = Stream.of("������", "����������", "������", "������");
    System.out.println(countries3.map(String::toUpperCase).collect(Collectors.toList()));


    System.out.println("�������� � ������� �������� �������");
    Stream<String> countries4 = Stream.of("������", "����������", "������", "������");
    System.out.println(countries4.map(string -> "'" + string + "'").collect(Collectors.toList()));

    System.out.println("���������� � ������� � ����� ������");
    Stream<String> countries5 = Stream.of("������", "����������", "������", "������");
    countries5.forEach(System.out::println);
  }
}
