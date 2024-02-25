package homework.day8.pack;

import java.util.*;

// 15.
public class Chair {
  private int height;
  private int width;

  public static void main(String[] args) {
    // ������� ������ ������� (������ Chair) furniture �� 3 ������� ������� (1, 4, 2) � ������� (2,
    // 2, 4) ��������������,
    // ����� (Arrays.asList())
    List<Chair> chairs = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));
    System.out.println(chairs);
    // �������������� ������ ����� for-each � ���������� ������������ ������ �� ������ � �������
    // ����� ������
    for (Chair chair : chairs) {
      System.out.printf(String.valueOf(chair.getWidth() * chair.getHeight()) + " ");
    }
    System.out.println();
    // ������� ������ �����, ��� ������ �������� ����� �����, � ��������� ������ �����
    Map<Integer, Chair> myChairs = new HashMap<>();

    // ��������� ����� ���������� �� ����������� ������, ��������� � �������� ����� ����� ����������
    // �����
    int key = 1;
    for (Chair chair : chairs) {
      myChairs.put(key++, chair);
    }
    System.out.println(myChairs);
    System.out.println();
    // �������������� ����� � ���������� ����� � �������
    for (Integer key2 : myChairs.keySet()) {
      System.out.println(key2);
    }
    System.out.println();
    // �������������� ����� � ���������� �������� � �������
    for (Chair values : myChairs.values()) {
      System.out.println(values);
    }
    System.out.println();
    // �������������� ����� � ���������� ���� ����-�������� � �������
    for (Map.Entry<Integer, Chair> entry : myChairs.entrySet()) {
      System.out.println("����: " + entry.getKey() + ", ��������: " + entry.getValue());
    }
  }

  public Chair(int height, int width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Chair chair = (Chair) o;
    return getHeight() == chair.getHeight() && getWidth() == chair.getWidth();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getHeight(), getWidth());
  }

  @Override
  public String toString() {
    return "Chair{" + "height=" + height + ", width=" + width + '}';
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }
}
