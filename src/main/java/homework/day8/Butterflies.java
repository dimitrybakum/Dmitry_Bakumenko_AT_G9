package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
  public static void main(String[] args) {

    List<String> butterfliesList = new ArrayList<>();
    butterfliesList.add("Common blue");
    butterfliesList.add("Swallowtail");
    butterfliesList.add("Aglais io");
    butterfliesList.add("Common blue");

    System.out.println();

    System.out.println(
        "�������������� ������ ����� for-each � ���������� ����� � ������� � ��������");
    for (String butterfly : butterfliesList) {
      System.out.println("'" + butterfly + "'");
    }

    System.out.println("��������� ������� ������� �������� ����� \"�\" � ������� ����� � �������");
    int count = 0;
    for (String butterfly : butterfliesList) {
      if (butterfly.toLowerCase().contains("o")) {
        count++;
      }
    }
    System.out.println("���������� �������, ���������� ����� '�': " + count);

    System.out.println(
        "�������������� ������ �� ������� � ���������� ����� � ������� ����� ������");
    for (int i = 0; i < butterfliesList.size(); i++) {
      System.out.printf(butterfliesList.get(i) + " ");
    }
    System.out.println();

    System.out.println(
        "�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������� ������\n");
    for (String butterfly : butterfliesList) {
      System.out.println(butterfly);
    }
  }
}
