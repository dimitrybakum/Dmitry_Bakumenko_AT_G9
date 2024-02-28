package classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public record MyStream() {
  public static void main(String[] args) {
    List<String> myList = Arrays.asList("����", "����", "����", "����", "�����");

    long counter = myList.stream().filter("����"::equalsIgnoreCase).count();

    System.out.println(counter);
    System.out.println( myList.stream().findFirst().orElse("����"));

    System.out.println( myList.stream().filter("����"::equalsIgnoreCase).findFirst().get());

    System.out.println( myList.stream().skip(4).findFirst().get());

    System.out.println( myList.stream().skip(2).limit(2).collect(Collectors.toList()));

    System.out.println( myList.stream().filter("�"::equalsIgnoreCase).collect(Collectors.toList()));

  }
}
