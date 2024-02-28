package classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public record MyStream() {
  public static void main(String[] args) {
    List<String> myList = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

    long counter = myList.stream().filter("мама"::equalsIgnoreCase).count();

    System.out.println(counter);
    System.out.println( myList.stream().findFirst().orElse("мама"));

    System.out.println( myList.stream().filter("мама"::equalsIgnoreCase).findFirst().get());

    System.out.println( myList.stream().skip(4).findFirst().get());

    System.out.println( myList.stream().skip(2).limit(2).collect(Collectors.toList()));

    System.out.println( myList.stream().filter("м"::equalsIgnoreCase).collect(Collectors.toList()));

  }
}
