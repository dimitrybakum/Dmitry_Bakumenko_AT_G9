package homework.day8.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// 12.
public class Person {
  private int age;
  private String name;

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public static void main(String[] args) {

    // Создать пустой список людей (класса Person) people (через new ArrayList)
    List<Person> people = new ArrayList<>();

    // Заполнить 4 людьми с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша)
    // соответственно

    // String[] names = {"Коля", "Оля", "Вася", "Маша"};
    // int[] ages = {32, 24, 55, 63};
    people.add(0, new Person(32, "Коля"));
    people.add(1, new Person(24, "Оля"));
    people.add(2, new Person(55, "Вася"));
    people.add(3, new Person(63, "Маша"));
    System.out.println(people);

    // Проитерировать список через for-each и отпечатать возраст в консоль через пробел
    for (Person pers : people) {
      System.out.printf(pers.getAge() + " ");
    }
    System.out.println();
    // Проитерировать список через for-each и отпечатать имена в консоль через пробел
    for (Person pers : people) {
      System.out.printf(pers.getName() + " ");
    }
    System.out.println();
    // Проитерировать список по индексу и отпечатать людей (.toString()) в консоль с новой строки
    for (int i = 0; i < people.size(); i++) {
      System.out.println(people.get(i).toString());
    }
  }

  @Override
  public String toString() {
    return "Person{" + "age=" + age + ", name='" + name + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAge(), getName());
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
