package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Birds {
  public static void main(String[] args) {

    System.out.println(
        "������� ������ ����� birds �� 5 ���� (�����, �����, �����, ������, �������, �����) ����� (Arrays.asList())");
    List<String> birds = Arrays.asList("�����", "�����", "�����", "������", "�������", "�����");

    System.out.println(
        "�������������� ������ ����� for-each � ���������� ����� � ������� � ����� ������ � ���� --�����--");
    for (String bird : birds) {
      System.out.println("--" + bird + "--");
    }
    System.out.println();

    System.out.println(
        "��������� ������� ���� �������� ������ 1 ������� � ������� � ����� � �������");
    int count = countBirdsWithMultipleVowels(birds);
    System.out.println("���������� ���� � ����� ��� ����� �������: " + count);
    System.out.println();

    System.out.println(
        "�������������� ������ �� ������� � ���������� ����� � ������� ����� ������");

    for (int i = 0; i < birds.size(); i++) {
      System.out.printf(birds.get(i) + " ");
    }
    System.out.println();

    System.out.println("�������� 3-� ������� ������ �� ������");
    birds.set(2, "������");

    System.out.println(
        "�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������");
    for (String bird : birds) {
      System.out.printf(bird + " ");
    }
  }

  public static int countBirdsWithMultipleVowels(List<String> birds) {
    int count = 0;
    String vowels = "����������������";
    for (String bird : birds) {
      int vowelCount = 0;
      for (int i = 0; i < bird.length(); i++) {
        char ch = bird.charAt(i);
        if (vowels.indexOf(ch) >= 0) {
          vowelCount++;
        }
      }
      if (vowelCount > 1) {
        count++;
      }
    }
    return count;
  }
}
