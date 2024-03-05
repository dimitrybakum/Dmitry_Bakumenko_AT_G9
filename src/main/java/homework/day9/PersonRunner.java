package homework.day9;

import homework.day8.pack.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
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

    try (FileWriter avgAge = new FileWriter("avgAge.txt")) {
      avgAge.write(String.valueOf(people
              .filter(person -> person.getAge() < 60)
              .sorted(Comparator.comparing(Person::getName))
              .mapToInt(person -> person.getAge() + 4)
              .average()));

      System.out.println("Средний возраст был записаны в файл avgAge.txt");
    } catch (IOException e) {
      System.out.println("Ошибка при записи в файл: " + e.getMessage());
    }
    readFromFile("avgAge.txt");
  }
}
