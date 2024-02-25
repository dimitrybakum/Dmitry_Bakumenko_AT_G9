package homework.day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Countries {
  // 5.

  public static void main(String[] args) {

    // ������� ������ ������ �������� countries (����� new ArrayList)
    List<String> countries = new ArrayList<>();

    // �������� � ������ 4 ������ (������, ����������, ������, ������)
    String[] strArr = {"������", "����������", "������", "������"};
    for (String s : strArr) {
      countries.add(s);
    }

    // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������� � ��������
    for (String s : countries) {
      System.out.printf(s + ", ");
    }

    System.out.println();

    // ��������� ������� �����, � �������� ������� ������ 7 ���� � ������� ����� � �������
    Iterator<String> iterator = countries.iterator();
    int counter = 0;
    while (iterator.hasNext()) {
      if(iterator.next().length() < 7){
        counter++;
      }
    }
    System.out.println(counter);
    System.out.println();

    // �������������� ������ �� ������� � ���������� ����� � ������� � ����� ������
    for (int i = 0; i < countries.size(); i ++) {
      System.out.println(countries.get(i));
    }
  }
}
