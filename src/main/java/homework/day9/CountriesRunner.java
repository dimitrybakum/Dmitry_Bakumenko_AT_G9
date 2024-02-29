package homework.day9;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountriesRunner {
  public static void main(String[] args) {

    System.out.println("Создать поток данных стрингов countries из 4 стран (Андора, Португалия, Англия, Замбия)(через Stream.of())");
    Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");

    System.out.println("Отфильтровать страны, которые содержат в себе хотя бы одну гласную букву");
    System.out.println(countries.filter(string -> Pattern.compile("[аеиоуэюяАЕИОУЭЮЯ]").matcher(string).find()).collect(Collectors.joining("\n")));

    System.out.println("Отфильтровать страны, в названии которых меньше 7 букв");
    Stream<String> countries2 = Stream.of("Андора", "Португалия", "Англия", "Замбия");
    System.out.println(countries2.filter(string -> string.length() < 7).toList());

    System.out.println("Перевести все страны в верхний регистр");
    Stream<String> countries3 = Stream.of("Андора", "Португалия", "Англия", "Замбия");
    System.out.println(countries3.map(String::toUpperCase).collect(Collectors.toList()));


    System.out.println("Добавить к каждому названию кавычки");
    Stream<String> countries4 = Stream.of("Андора", "Португалия", "Англия", "Замбия");
    System.out.println(countries4.map(string -> "'" + string + "'").collect(Collectors.toList()));

    System.out.println("Отпечатать в консоль с новой строки");
    Stream<String> countries5 = Stream.of("Андора", "Португалия", "Англия", "Замбия");
    countries5.forEach(System.out::println);
  }
}
