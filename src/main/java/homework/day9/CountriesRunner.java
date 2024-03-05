package homework.day9;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CountriesRunner {
  public static void main(String[] args) {

    Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");
    countries
        .filter(string -> Pattern.compile("[аеиоуэюяАЕИОУЭЮЯ]").matcher(string).find())
        .filter(string -> string.length() < 7)
        .map(String::toUpperCase)
        .map(string -> "'" + string + "'")
        .forEach(System.out::println);
  }
}
