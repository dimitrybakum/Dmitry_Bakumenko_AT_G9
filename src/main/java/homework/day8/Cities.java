package homework.day8;

import java.util.ArrayList;

public class Cities {
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>();
    cities.add("�����");
    cities.add("������");
    cities.add("������");

    System.out.println("�������������� ������ ����� for-each � ���������� ����� � ������� � ����� ������");
    for (String city : cities) {
      System.out.println(city);
    }
    System.out.println();

    System.out.println("��������� ����� ���� ����� �� ���� ������ � ������� ����� � �������");
    int counter = 0;
    for (String city : cities) {
      counter += city.length();
    }
    System.out.println(counter);

    System.out.println("�������������� ������ �� ������� � ���������� ����� � ������� ����� ������");
    for (int i = 0; i < cities.size(); i++) {
      System.out.printf(cities.get(i) + " ");
    }
  }
}
