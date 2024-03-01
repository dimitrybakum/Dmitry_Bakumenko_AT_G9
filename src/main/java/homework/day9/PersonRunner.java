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
            new Person(32, "Коля"),
            new Person(24, "Оля"),
            new Person(55, "Вася"),
            new Person(63, "Маша"));

    System.out.println("Отфильтровать людей, которые моложе 60");
    people.filter(person -> person.getAge() < 60).forEach(System.out::println);

    Stream<Person> people2 =
        Stream.of(
            new Person(32, "Коля"),
            new Person(24, "Оля"),
            new Person(55, "Вася"),
            new Person(63, "Маша"));

    System.out.println("Отсортировать в восходящем порядке по именам");
    people2.mapToInt(Person::getAge).sorted().forEach(System.out::println);

    Stream<Person> people3 =
        Stream.of(
            new Person(32, "Коля"),
            new Person(24, "Оля"),
            new Person(55, "Вася"),
            new Person(63, "Маша"));

    System.out.println(
        "На основании существующего потока данных создать новый, в котором каждый новый Person имеет возраст на 4 года больше исходного");
    people3.map(person -> person.getAge() + 4).forEach(System.out::println);

    Stream<Person> people4 =
        Stream.of(
            new Person(32, "Коля"),
            new Person(24, "Оля"),
            new Person(55, "Вася"),
            new Person(63, "Маша"));
    System.out.println(
        "Вычислить средний возраст конечного списка людей и отпечатать в новый текстовый файл");
    try (FileWriter avgAge = new FileWriter("avgAge.txt")) {
      avgAge.write(String.valueOf(people4.mapToInt(Person::getAge).average()));

      System.out.println("Средний возраст был записаны в файл avgAge.txt");
    } catch (IOException e) {
      System.out.println("Ошибка при записи в файл: " + e.getMessage());
    }
    readFromFile("avgAge.txt");
  }
}
