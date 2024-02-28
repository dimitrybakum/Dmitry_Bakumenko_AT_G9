package homework.day8;

import java.util.*;

public class Numbers {
  public static void main(String[] args) {

    System.out.println("������� ������ ����� ����� numbers �� 8 ����� (3342, 34, 79, 23426, 68, 1324, 55, 7699) ����� (Arrays.asList())");
    List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

    System.out.println("�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������");
    for (int num : numbers) {
      System.out.println(num);
    }

    System.out.println("��������� ����� ���� ����� � ������� ��������� � �������");
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    System.out.println(sum);

    System.out.println("������������� ������ �� �����������");
    numbers.sort(null);

    System.out.println("�������������� ������ �� ������� � ���������� ����� � ������� ����� ������");
    for (int i = 0; i < numbers.size(); i++) {
      System.out.printf(numbers.get(i) + " ");
    }
    System.out.println();

    System.out.println("���������� ������ � �������� �������");
    Collections.reverse(numbers);

    System.out.println("�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������");
    for (int num : numbers) {
      System.out.printf(num + " ");
    }
  }
}
