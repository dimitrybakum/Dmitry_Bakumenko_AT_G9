package homework.day9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiguresRunner {
  public static void main(String[] args) {

    System.out.println(
        "Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник,Круг, Квадрат, Эллипс) через (Stream.of())");
    Stream<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
    System.out.println(figures.collect(Collectors.toList()));

    System.out.println(
        "Заменить каждое слово на целое число, соответствующее количеству буков вслове");
    Stream<String> figures2 = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
    System.out.println(figures2.map(String::length).collect(Collectors.toList()));

    System.out.println("Отфильтровать числа, которые больше 4");
    Stream<String> figures3 = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
    System.out.println(
        figures3.map(String::length).filter(s -> s > 4).collect(Collectors.toList()));

    System.out.println("Отпечатать все оставшиеся числа в консоль");
    Stream<String> figures4 = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
    System.out.println(
        figures4.map(String::length).filter(s -> s <= 4).collect(Collectors.toList()));
  }
}
