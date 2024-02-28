package homework.day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Countries {
  public static void main(String[] args) {

    List<String> countries = new ArrayList<>();
    countries.add("������");
    countries.add("����������");
    countries.add("������");
    countries.add("������");

    System.out.println("�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������� � ��������");
    for (String s : countries) {
      System.out.printf(s + ", ");
    }
    System.out.println();

    System.out.println("��������� ������� �����, � �������� ������� ������ 7 ���� � ������� ����� � �������");
    Iterator<String> iterator = countries.iterator();
    int counter = 0;
    while (iterator.hasNext()) {
      if (iterator.next().length() < 7) {
        counter++;
      }
    }
    System.out.println(counter);
    System.out.println();

    System.out.println("�������������� ������ �� ������� � ���������� ����� � ������� � ����� ������");
    for (int i = 0; i < countries.size(); i++) {
      System.out.println(countries.get(i));
    }
  }
}
