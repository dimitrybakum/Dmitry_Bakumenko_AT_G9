package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Elements {
  // 7.


  public static void main(String[] args) {

    // ������� ������ ������ �������� elements (����� new ArrayList)

    List<String> elements = new ArrayList<>();
    // �������� � ������ 6 ��������� (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
    String[] elems = {"Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb"};
    for (String elem : elems) {
      elements.add(elem);
    }
    System.out.println(elements);

    // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������
    for (String elem : elements) {
      String resultStr = "";
      System.out.printf(resultStr + (elem + " "));
    }
    // ��������� ������� �������� ��������� ������� �����, ��� �� ������ ����� � ������� ����� �
    // �������
    int counter = 0;
    for (String elem : elements) {
      // ������������ ���������� �������
      int vowelsCount = countSpaces(elem);
      // ���� ���������� ������� ������ 1, ����������� �������
      if (vowelsCount > 0) {
        counter++;
      }
    }
    System.out.println();
    System.out.println("���������� ��������� � ��������: " + counter);
    // �������������� ������ �� ������� � ���������� ����� � ������� ����� ������

    String resultStr = "";
    for (String i : elements) {
      resultStr  += i + " ";

    }
    System.out.println(resultStr);
    // �� 4-� ������� �������� Spinner
    elements.add(3, "Spinner");
    System.out.println(elements);
    // ������� 2-� ������� ������
    elements.remove(1);
    System.out.println(elements);
    // �������� 5-� ������� �� Switch
    elements.set(4, "Switch");
    System.out.println(elements);
    // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������
    for (String elem : elements) {
      String resultStr2 = "";
      System.out.printf(resultStr2 + (elem + " "));
    }
  }

  public static int countSpaces(String word) {
    int counter = 0;
    String spaces = " ";
      if (word.contains(spaces)) {
        counter++;
      }
      return counter;
  }
}