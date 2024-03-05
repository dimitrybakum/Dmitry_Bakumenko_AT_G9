package classwork.fay10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Alphabet {
  public static void main(String[] args) {
    List<Person> list =
        Arrays.asList(
            new Person("����", 13, Person.Sex.MAN),
            new Person("����", 28, Person.Sex.WOMEN),
            new Person("����", 24, Person.Sex.MAN),
            new Person("����", 38, Person.Sex.WOMEN),
            new Person("����� ��������", 72, Person.Sex.MAN));

    list.stream().map(Person::getName).sorted().forEach(System.out::println);

    System.out.println(list.stream().sorted((person1, person2) -> person2.getName().compareTo(person1.getName()))
            .peek(person -> System.out.println(person.toString())).collect(Collectors.toList()));
  }
}
