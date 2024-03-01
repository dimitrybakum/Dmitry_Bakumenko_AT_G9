package homework.day9;

import homework.day8.pack.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

import static homework.day8.FileReader.readFromFile;

public class PersonRunner {
  public static void main(String[] args) {
    Stream<Person> people =
        Stream.of(
            new Person(32, "����"),
            new Person(24, "���"),
            new Person(55, "����"),
            new Person(63, "����"));

    System.out.println("������������� �����, ������� ������ 60");
    people.filter(person -> person.getAge() < 60).forEach(System.out::println);

    Stream<Person> people2 =
        Stream.of(
            new Person(32, "����"),
            new Person(24, "���"),
            new Person(55, "����"),
            new Person(63, "����"));

    System.out.println("������������� � ���������� ������� �� ������");
    people2.mapToInt(Person::getAge).sorted().forEach(System.out::println);

    Stream<Person> people3 =
        Stream.of(
            new Person(32, "����"),
            new Person(24, "���"),
            new Person(55, "����"),
            new Person(63, "����"));

    System.out.println(
        "�� ��������� ������������� ������ ������ ������� �����, � ������� ������ ����� Person ����� ������� �� 4 ���� ������ ���������");
    people3.map(person -> person.getAge() + 4).forEach(System.out::println);

    Stream<Person> people4 =
        Stream.of(
            new Person(32, "����"),
            new Person(24, "���"),
            new Person(55, "����"),
            new Person(63, "����"));
    System.out.println(
        "��������� ������� ������� ��������� ������ ����� � ���������� � ����� ��������� ����");
    try (FileWriter avgAge = new FileWriter("avgAge.txt")) {
      avgAge.write(String.valueOf(people4.mapToInt(Person::getAge).average()));

      System.out.println("������� ������� ��� �������� � ���� avgAge.txt");
    } catch (IOException e) {
      System.out.println("������ ��� ������ � ����: " + e.getMessage());
    }
    readFromFile("avgAge.txt");
  }
}
