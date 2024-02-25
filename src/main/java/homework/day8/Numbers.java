package homework.day8;

import java.util.*;

public class Numbers {
  // 8.
  public static void main(String[] args) {

    // ������� ������ ����� ����� numbers �� 8 ����� (3342, 34, 79, 23426, 68, 1324, 55, 7699) �����
    // (Arrays.asList())
    System.out.println("������� ������ ����� ����� numbers �� 8 ����� (3342, 34, 79, 23426, 68, 1324, 55, 7699) ����� (Arrays.asList())");
    List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);
    System.out.println(numbers);
    // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������
    System.out.println("�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������");
    for (int num : numbers) {
      System.out.println(num);
    }
    // ��������� ����� ���� ����� � ������� ��������� � �������
    System.out.println("��������� ����� ���� ����� � ������� ��������� � �������");
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    System.out.println(sum);
    // ������������� ������ �� �����������
    numbers.sort(null);
    // �������������� ������ �� ������� � ���������� ����� � ������� ����� ������
    System.out.println("�������������� ������ �� ������� � ���������� ����� � ������� ����� ������");
    String resultStr = "";
    for (int i = 0; i < numbers.size(); i++) {
      resultStr += numbers.get(i) + " ";
    }
    System.out.println(resultStr);
    // ���������� ������ � �������� �������
    System.out.println("���������� ������ � �������� �������");
    Collections.reverse(numbers);
    System.out.println(numbers);
    // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������
    System.out.println("�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������");
    String resultStrX = "";
    for (int num : numbers) {
      resultStrX += num + " ";
    }
    System.out.println(resultStrX);
  }
}
