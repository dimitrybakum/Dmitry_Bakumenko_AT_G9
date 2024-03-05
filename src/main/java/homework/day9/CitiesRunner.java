package homework.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CitiesRunner {

  public static void main(String[] args) {

    System.out.println("������� ������ ������ �������� cities (����� new ArrayList)");
    List<String> cities = new ArrayList<>();

    System.out.println("�������� � ������ 3 ������ (�����, ������, ������)");
    cities.add("�����");
    cities.add("������");
    cities.add("������");

    System.out.println("��������� ����� ���� ����� �� ���� ������ � ������� ����� � �������");
    System.out.println(cities.stream().collect(Collectors.joining()).length());
  }
}
