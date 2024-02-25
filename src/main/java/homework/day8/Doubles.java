package homework.day8;

import java.util.Arrays;
import java.util.List;

import static java.lang.Double.valueOf;

public class Doubles {
  // 9.
  public static void main(String[] args) {

    // ������� ������ ������� ����� doubles �� 8 ����� (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5,
    // 769.9) ����� (Arrays.asList())
    System.out.println("������� ������ ������� ����� doubles �� 8 ����� ����� (Arrays.asList())");
    List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
    System.out.println(doubles);
    // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������
    System.out.println(
        "�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������");
    for (Double myDouble : doubles) {
      System.out.printf(myDouble + " ");
    }
    System.out.println();
    // ��������� ������������ ���� ����� � ������� ��������� � �������
    System.out.println("��������� ������������ ���� ����� � ������� ��������� � �������");
    Double multResult = 1.0;
    for (double num : doubles) {
      multResult *= num;
    }
    System.out.println(multResult);
    // ����� ����� ���� ������� ������ � ������� ��������� � �������
    System.out.println("����� ����� ���� ������� ������ � ������� ��������� � �������");
    double sumOfFloats = 0.0;
    for (double num : doubles) {
      sumOfFloats += num - Math.floor(num);
    }
    System.out.println(sumOfFloats);
    // �������������� ������ �� ������� � ������� ����� ����� � ������� ����� ������
    System.out.println("�������������� ������ �� ������� � ������� ����� ����� � ������� ����� ������");
    double whole = 0;
    for (int i = 0; i < doubles.size(); i++) {
      System.out.printf(Math.floor(doubles.get(i)) + " ");
    }
  }//Math.floor(doubles.get(i))
}
