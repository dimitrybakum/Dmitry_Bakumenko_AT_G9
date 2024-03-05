package classwork.fay10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonRunner {
  // ����� ���-�� ������������ ���������������
  // ����� � ������� (18 - 55 ��� (�������), 60 ���
  // (�������))
  // 2-�� ��������� (� � ��� ������������� Stream API)
  public static void main(String[] args) {

    List<Person> list =
        Arrays.asList(
            new Person("����", 13, Person.Sex.MAN),
            new Person("����", 28, Person.Sex.WOMEN),
            new Person("����", 24, Person.Sex.MAN),
            new Person("����", 38, Person.Sex.WOMEN),
            new Person("����� ��������", 72, Person.Sex.MAN));

    System.out.println(
        list.stream()
            .filter(person -> person.getAge() > 18)
            .filter(
                person ->
                    (person.getAge() < 55 && person.getSex() == Person.Sex.WOMEN)
                        || (person.getAge() < 60 && person.getSex() == Person.Sex.MAN))
            .count());
  }

}
