package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Birds {
  // 6.
  public static void main(String[] args) {

    // ������� ������ ����� birds �� 5 ���� (�����, �����, �����, ������, �������, �����) �����
    // (Arrays.asList())
    List<String> birds = Arrays.asList("�����", "�����", "�����", "������", "�������", "�����");

    // �������������� ������ ����� for-each � ���������� ����� � ������� � ����� ������ � ����
    // --�����--
    for (String bird : birds) {
      System.out.println("--" + bird + "--");
    }
    // ��������� ������� ���� �������� ������ 1 ������� � ������� � ����� � �������
    int counter = 0;
    for (String bird : birds) {
      // ������������ ���������� �������
      int vowelsCount = countVowels(bird);
      // ���� ���������� ������� ������ 1, ����������� �������
      if (vowelsCount > 1) {
        counter++;
      }
    }

    // ������� ���������
    System.out.println("���������� ���� � ����� ��� 1 �������: " + counter);

    // �������������� ������ �� ������� � ���������� ����� � ������� ����� ������
    String resultString = "";
    for (String bird : birds) {
      resultString += bird + " ";
    }

    System.out.println(resultString);
    // �������� 3-� ������� ������ �� ������
    birds.set(2, "������");

    // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������
    String resultString2 = "";
    for (String bird : birds) {
      resultString2 += bird + " ";
    }
    System.out.println(resultString2);
  }
  public static int countVowels(String word) {
    int counter = 0;
    String vowels = "��������";
    // ��������� ������ ������ � �����
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      // ���� ������ �������� �������, ����������� �������
      if (vowels.indexOf(ch) >= 0) {
        counter++;
      }
    }
    return counter;
  }
}
