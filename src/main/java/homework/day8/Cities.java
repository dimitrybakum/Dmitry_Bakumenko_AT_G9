package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cities {
  // ������� ������ ������ �������� cities (����� new ArrayList)

  public static void main(String[] args) {

    ArrayList<String> cities = new ArrayList<>();
    cities.add("�����");
    cities.add("������");
    cities.add("������");
    System.out.println(cities);
    for (String city : cities) {
      System.out.println(city);
    }
    int counter = 0;
    for (String city : cities) {
      counter += city.length();
    }
    System.out.println(counter);
    String str = "";
    for (int i = 0; i < cities.size(); i++) {
      str += cities.get(i) + " ";
    }
    System.out.println(str);
  }
  // �������� � ������ 3 ������ (�����, ������, ������)
  // �������������� ������ ����� for-each � ���������� ����� � ������� � ����� ������
  // ��������� ����� ���� ����� �� ���� ������ � ������� ����� � �������
  // �������������� ������ �� ������� � ���������� ����� � ������� ����� ������
}
