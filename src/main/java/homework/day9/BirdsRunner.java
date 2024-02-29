package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirdsRunner {
  public static void main(String[] args) {

    List<String> birds = Arrays.asList("�����", "�����", "�����", "������", "�������", "�����");
    System.out.println(birds);

    System.out.println(
        "������� �� ������ ����� ������, �������� � ������ ����� \"�\" �� ����� \"�\"");
    System.out.println(
        birds.stream()
            .map(String::toLowerCase)
            .map(e -> e.replace("�", "�"))
            .collect(Collectors.toList()));

    System.out.println("������� ��� ����� � ���� ������ � ������ ��������");
    System.out.println(birds.stream().map(String::toLowerCase).collect(Collectors.joining()));

    System.out.println("������ ��� ������� ������� �����");
    System.out.println(
        birds.stream().map(string -> string.replace("�", "")).collect(Collectors.toList()));

    // ToDo ������� �� ����� ������ �� ����� "�"

    System.out.println("���������� � ������� � ����� ������ � ���� --�����--");
    System.out.println(
        birds.stream().map(string -> "--" + string + "--").collect(Collectors.joining("\n")));
  }
}
