package homework.day8.pack;

import java.util.ArrayList;
import java.util.List;

// 12.
public class Person {
  private int age;
  private String name;

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" + "age=" + age + ", name='" + name + '\'' + '}';
  }

  public static void main(String[] args) {

    // ������� ������ ������ ����� (������ Person) people (����� new ArrayList)
    List<Person> people = new ArrayList<>();

    // ��������� 4 ������ � ��������� (32, 24, 55, 63) � ������� (����, ���, ����, ����)
    // ��������������

    // String[] names = {"����", "���", "����", "����"};
    // int[] ages = {32, 24, 55, 63};
    people.add(0, new Person(32, "����"));
    people.add(1, new Person(24, "���"));
    people.add(2, new Person(55, "����"));
    people.add(3, new Person(63, "����"));
    System.out.println(people);

    // �������������� ������ ����� for-each � ���������� ������� � ������� ����� ������
    for (Person pers : people) {
      System.out.printf(pers.getAge() + " ");
    }
    System.out.println();
    // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������
    for (Person pers : people) {
      System.out.printf(pers.getName() + " ");
    }
    System.out.println();
    // �������������� ������ �� ������� � ���������� ����� (.toString()) � ������� � ����� ������
    for (int i = 0; i < people.size(); i++) {
      System.out.println(people.get(i).toString());
    }
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
