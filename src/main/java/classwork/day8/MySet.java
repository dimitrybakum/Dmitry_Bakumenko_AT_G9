package classwork.day8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {
  public static void main(String[] args) {

    Set<String> mySetItem = new HashSet<>();

    String[] stringArr = "мама мыла раму мыла".split(" ");

    for (String i : stringArr) {
      mySetItem.add(i);
    }

    Iterator<String> iterator = mySetItem.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println();

    for (String i : mySetItem) {
      System.out.println(i);
    }
  }
}
