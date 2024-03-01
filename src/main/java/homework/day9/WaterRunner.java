package homework.day9;

import homework.day8.pack.Water;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
  public static void main(String[] args) {
    Stream<Water> water1 =
        Stream.of(
            new Water("����������", "���"),
            new Water("����������", "���"),
            new Water("������", "���������"),
            new Water("�����", "������"));

    System.out.println("������������� ����, ���� ������� �� \"����������\"");
    water1.filter(water -> water.getColor() != "����������").forEach(System.out::println);

    Stream<Water> water2 =
        Stream.of(
            new Water("����������", "���"),
            new Water("����������", "���"),
            new Water("������", "���������"),
            new Water("�����", "������"));

    System.out.println("������������� � ���������� ������� �� ������");
    water2.map(Water::getSmell).sorted().forEach(System.out::println);

    Stream<Water> water3 =
        Stream.of(
            new Water("����������", "���"),
            new Water("����������", "���"),
            new Water("������", "���������"),
            new Water("�����", "������"));

    System.out.println(
        "�� ��������� ������������� ������ ������ ������� �����,"
            + " � ������� ������ ����� Water ����� ����� � ��������� ������ �, ���� ����� ����������� ");
    water3
        .map(
            water -> {
              String smell = water.getSmell();
              if (smell.contains("�")) smell = smell.replace("�", "��");
              return new Water(water.getColor(), smell);
            })
        .forEach(System.out::println);

    Stream<Water> water4 =
        Stream.of(
            new Water("����������", "���"),
            new Water("����������", "���"),
            new Water("������", "���������"),
            new Water("�����", "������"));

    System.out.println("���������� ����� ���� �������� � ���� ������");
    System.out.println(water4.map(Water::getSmell).collect(Collectors.joining()));

    Stream<Water> water5 =
        Stream.of(
            new Water("����������", "���"),
            new Water("����������", "���"),
            new Water("������", "���������"),
            new Water("�����", "������"));

    System.out.println("����� ���������� ����� � ��� � ��������� � �������");
    System.out.println(water5.map(Water::getSmell).collect(Collectors.joining()).length());
  }
}
