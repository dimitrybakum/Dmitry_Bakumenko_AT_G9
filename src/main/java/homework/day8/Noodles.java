package homework.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Noodles {
  // 10.
  public static void main(String[] args) {

    //
    // ������� ������ ������ �������� noodles (����� new ArrayList)
    List<String> noddles = new ArrayList<>();

    // �������� � ������ 4 ���� ������� (������� Hakka, Ramen, Hibachi, Schezwan)
    String[] noodlesTypes = {"Hakka", "Ramen", "Hibachi", "Schezwan"};
    for (String elem : noodlesTypes) {
      noddles.add(elem);
    }
    System.out.println(noddles);
    // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ����
    for (String n : noddles) {
        String str = "";
        str += n + "-";
        System.out.printf(str);
    }
    // �������� � ������ ����� ����� "�" �� ����� "�"

    // �������������� ������ �� ������� � ���������� ����� � ������� ����� ������
  }
}
