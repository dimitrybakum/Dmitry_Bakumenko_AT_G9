package homework.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ButterfliesRunner {

  public static void main(String[] args) {

    List<String> butterflies = new ArrayList<>();
    butterflies.add("Common blue");
    butterflies.add("Swallowtail");
    butterflies.add("Aglais io");
    butterflies.add("Common blue");

    System.out.println("�������� � ������� �������� �������");
    System.out.println(
        butterflies.stream().map(butterfly -> "'" + butterfly + "'").collect(Collectors.toList()));
    System.out.println();
    System.out.println("�������� ������ �� �����, ������� �������� ����� \"a\" � ����� \"�\"");
    System.out.println(
        butterflies.stream()
            .flatMap(string -> Arrays.stream(string.split(" ")))
            .filter(str -> str.contains("a") || str.contains("o"))
            .collect(Collectors.toList()));
    System.out.println();
    System.out.println("������� ����� � ������� � ����� ������");
    butterflies.stream().forEach(System.out::println);
  }
}
