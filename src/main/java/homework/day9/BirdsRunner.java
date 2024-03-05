package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirdsRunner {
  public static void main(String[] args) {
    System.out.println(
        "//Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())\n"
            + "  //Создать из списка поток данных, заменить в каждую букву \"о\" на букву \"а\"\n"
            + "  //Убрать все символы мягкого знака\n"
            + "  //Разбить на новые строки по букве \"б\"\n"
            + "  //Отпечатать в консоль с новой строки в виде --Чайка--");

    List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

    birds.stream()
        .map(e -> e.toLowerCase().replace("о", "а"))
        .map(e -> e.replaceAll("ь", ""))
        .map(e -> Arrays.toString(e.split("б")))
        .map(e -> "--" + e + "--")
        .forEach(System.out::println);
  }
}
