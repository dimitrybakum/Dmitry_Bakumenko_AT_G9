package homework.day8.pack;

import java.util.Arrays;
import java.util.List;

// 13.
public class Water {
  private String color;
  private String smell;

  public Water(String color, String smell) {
    this.color = color;
    this.smell = smell;
  }

  @Override
  public String toString() {
    return "Water{" + "color='" + color + '\'' + ", smell='" + smell + '\'' + '}';
  }

  public static void main(String[] args) {
    // ������� ������ ���� (������ Water) water �� 3 �������� ����
    // � ������ (����������, ����������, ������)
    // � ������� (���, ���, ���������) ��������������,
    // ����� (Arrays.asList())
    List<Water> waters =
        Arrays.asList(
            new Water("����������", "���"),
            new Water("����������", "���"),
            new Water("������", "���������"));
    System.out.println(waters);
    // �������������� ������ ����� for-each � ���������� ���� ����-���� ����� ���� � ������� � �����
    // ������
    for (Water water : waters) {
      System.out.println(water.getColor() + "-" + water.getSmell());
    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getSmell() {
    return smell;
  }

  public void setSmell(String smell) {
    this.smell = smell;
  }
}
