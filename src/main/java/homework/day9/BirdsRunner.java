package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirdsRunner {
  public static void main(String[] args) {
    System.out.println(
        "//������� ������ ����� birds �� 5 ���� (�����, �����, �����, ������, �������, �����) ����� (Arrays.asList())\n"
            + "  //������� �� ������ ����� ������, �������� � ������ ����� \"�\" �� ����� \"�\"\n"
            + "  //������ ��� ������� ������� �����\n"
            + "  //������� �� ����� ������ �� ����� \"�\"\n"
            + "  //���������� � ������� � ����� ������ � ���� --�����--");

    List<String> birds = Arrays.asList("�����", "�����", "�����", "������", "�������", "�����");

    birds.stream()
        .map(e -> e.toLowerCase().replace("�", "�"))
        .map(e -> e.replaceAll("�", ""))
        .map(e -> Arrays.toString(e.split("�")))
        .map(e -> "--" + e + "--")
        .forEach(System.out::println);
  }
}
