package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Doubles {
  public static void main(String[] args) {

    List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);


    System.out.println("�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������");
    for (Double myDouble : doubles) {
      System.out.printf(myDouble + " ");
    }
    System.out.println();

    System.out.println("��������� ������������ ���� ����� � ������� ��������� � �������");
    double multResult = 1.0;
    for (double num : doubles) {
      multResult *= num;
    }
    System.out.println(multResult);

    System.out.println("����� ����� ���� ������� ������ � ������� ��������� � �������");
    double sumOfFloats = 0.0;
    for (double num : doubles) {
      sumOfFloats += num - Math.floor(num);
    }
    System.out.println(sumOfFloats);

    System.out.println("�������������� ������ �� ������� � ������� ����� ����� � ������� ����� ������");
    double whole = 0;
    for (int i = 0; i < doubles.size(); i++) {
      System.out.printf(Math.floor(doubles.get(i)) + " ");
    }
  }
}
