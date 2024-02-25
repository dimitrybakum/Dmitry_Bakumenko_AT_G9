package homework.day8;

import org.w3c.dom.css.Counter;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
  public static void main(String[] args) {
    // ������� ������ ������ �������� butterflies (����� new ArrayList)
    // �������� � ������ 4 ������� (Common blue, Swallowtail, Aglais io, Common blue)
    // �������������� ������ ����� for-each � ���������� ����� � ������� � ��������
    // ��������� ������� ������� �������� ����� "�" � ������� ����� � �������
    // �������������� ������ �� ������� � ���������� ����� � ������� ����� ������
    // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������� ������
    String[] stringArr = "Common blue, Swallowtail, Aglais io, Common blue".split(", ");

    List<String> butterfliesList = new ArrayList<>();

    for (int i = 0; i < stringArr.length; i++) {
      butterfliesList.add(stringArr[i]);
    }

    System.out.println();
    for (int i = 0; i < butterfliesList.size(); i++) {
      System.out.println(butterfliesList.get(i));
    }
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // �������������� ������ ����� for-each � ���������� ����� � ������� � ��������
    for (String i : butterfliesList) {
      System.out.println("'" + i + "'");
    }
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // ��������� ������� ������� �������� ����� "�" � ������� ����� � �������
    int count = 0;
    for (String butterfly : butterfliesList) {
      if (butterfly.toLowerCase().contains("o")) {
        count++;
      }
    }
    System.out.println("���������� �������, ���������� ����� '�': " + count);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // �������������� ������ �� ������� � ���������� ����� � ������� ����� ������
    String resultString = "";
    for (String i : butterfliesList) {
      resultString += i + " ";
    }
    System.out.printf(resultString).println();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    //// �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������� ������
    for (String i : butterfliesList) {
      System.out.println(i + "\n");
    }
  }
}
