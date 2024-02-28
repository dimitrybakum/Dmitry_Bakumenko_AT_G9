package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Elements {

  public static void main(String[] args) {

    List<String> elements = new ArrayList<>();
    elements.add("Text field");
    elements.add("Radio");
    elements.add("Check-box");
    elements.add("Drop-down");
    elements.add("Picker");
    elements.add("Breadcrumb");

    System.out.println("�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������");
    for (String elem : elements) {
      System.out.printf(elem + " ");
    }
    System.out.println();

    System.out.println("��������� ������� �������� ��������� ������� �����, ��� �� ������ ����� � ������� ����� � �������");
    int counter = countElemsWithSeveralWords(elements);
    System.out.println("���������� �������� ��������� �����, ��� �� ������ �����: " + counter);

    System.out.println("�������������� ������ �� ������� � ���������� ����� � ������� ����� ������");
    for (int i = 0; i < elements.size(); i++) {
      System.out.printf(elements.get(i) + " ");
    }
    System.out.println();

    System.out.println("�� 4-� ������� �������� Spinner");
    elements.add(3, "Spinner");
    System.out.println(elements);

    System.out.println("������� 2-� ������� ������");
    elements.remove(1);
    System.out.println(elements);

    System.out.println("�������� 5-� ������� �� Switch");
    elements.set(4, "Switch");
    System.out.println(elements);

    System.out.println("�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������");
    for (String elem : elements) {
      System.out.printf(elem + " ");
    }
  }

  public static int countElemsWithSeveralWords(List list) {
    int counter = 0;
    String spaces = " ";
    String dash = "-";
    for (Object s : list) {
      if (s.toString().contains(spaces) || s.toString().contains(dash)) {
        counter++;
      }
    }
    return counter;
  }
}
