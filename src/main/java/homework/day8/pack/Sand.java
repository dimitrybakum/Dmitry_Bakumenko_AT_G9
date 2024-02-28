package homework.day8.pack;

import java.util.*;

public class Sand {
  private int weight;
  private String name;

  public Sand(int weight, String name) {
    this.weight = weight;
    this.name = name;
  }

  public static void main(String[] args) {
    List<Sand> sands = new ArrayList<>();

    sands.add(0, new Sand(2, "������"));
    sands.add(1, new Sand(4, "������"));
    sands.add(2, new Sand(2, "���������"));
    sands.add(3, new Sand(7, "������"));

    System.out.println(
        "�������������� ������ ����� for-each � ���������� ��� � ������� ����� ������");
    for (Sand sand : sands) {
      System.out.printf(sand.getWeight() + " ");
    }System.out.println();

    System.out.println(
        "�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������");
    for (Sand sand : sands) {
      System.out.printf(sand.getName() + " ");
    }System.out.println();

    System.out.println(
        "������� ������ �����, ��� ������ �������� ����� �����, � ��������� ������ �����");
    Map<Integer, Sand> sandMap = new HashMap<>();

    System.out.println(
        "��������� ����� ���������� �� ����������� ������, ��������� � �������� ����� ����� ���������� �����");

    int key = 1;
    for (Sand sand : sands) {
      sandMap.put(key++, sand);
    }
    System.out.println(sandMap);

    System.out.println("�������������� ����� � ���������� ����� � �������");
    for (Integer keys : sandMap.keySet()) {
      System.out.println("����: " + keys);
    }System.out.println();

    System.out.println("�������������� ����� � ���������� �������� � �������");
    for (Sand values : sandMap.values()) {
      System.out.println("��������: " + values.getName());
    }System.out.println();

    System.out.println("�������������� ����� � ���������� ���� ����-�������� � �������");
    for (Map.Entry<Integer, Sand> entry : sandMap.entrySet()) {
      System.out.println("����: " + entry.getKey() + ", ��������: " + entry.getValue());
    }
  }

  @Override
  public String toString() {
    return "Sand{" + "weight=" + weight + ", name='" + name + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Sand sand = (Sand) o;
    return getWeight() == sand.getWeight() && Objects.equals(getName(), sand.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getWeight(), getName());
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
