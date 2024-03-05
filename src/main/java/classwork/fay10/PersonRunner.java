package classwork.fay10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonRunner {
  // Найти кол-во потенциально работоспособных
  // людей в выборке (18 - 55 лет (женщины), 60 лет
  // (мужчины))
  // 2-мя способами (с и без использования Stream API)
  public static void main(String[] args) {

    List<Person> list =
        Arrays.asList(
            new Person("Вася", 13, Person.Sex.MAN),
            new Person("Катя", 28, Person.Sex.WOMEN),
            new Person("Вова", 24, Person.Sex.MAN),
            new Person("Маша", 38, Person.Sex.WOMEN),
            new Person("Роман Петрович", 72, Person.Sex.MAN));

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
