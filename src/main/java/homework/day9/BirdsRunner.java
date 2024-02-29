package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirdsRunner {
  public static void main(String[] args) {

    List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
    System.out.println(birds);

    System.out.println(
        "Создать из списка поток данных, заменить в каждую букву \"о\" на букву \"а\"");
    System.out.println(
        birds.stream()
            .map(String::toLowerCase)
            .map(e -> e.replace("о", "а"))
            .collect(Collectors.toList()));

    System.out.println("Собрать все слова в одну строку в нижнем регистре");
    System.out.println(birds.stream().map(String::toLowerCase).collect(Collectors.joining()));

    System.out.println("Убрать все символы мягкого знака");
    System.out.println(
        birds.stream().map(string -> string.replace("ь", "")).collect(Collectors.toList()));

    // ToDo Разбить на новые строки по букве "б"

    System.out.println("Отпечатать в консоль с новой строки в виде --Чайка--");
    System.out.println(
        birds.stream().map(string -> "--" + string + "--").collect(Collectors.joining("\n")));
  }
}
