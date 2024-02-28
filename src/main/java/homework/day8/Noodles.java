package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Noodles {
  // 10.
  public static void main(String[] args) {

    List<String> noddles = new ArrayList<>();
    noddles.add("Hakka");
    noddles.add("Ramen");
    noddles.add("Hibachi");
    noddles.add("Schezwan");

    System.out.println("ѕроитерировать список через for-each и отпечатать слова в консоль через тире");

    for (String n : noddles) {
      System.out.printf(n + "-");
    }
    System.out.println();

    System.out.println("«аменить в каждом слове буквы \"а\" на букву \"о\"");
    // ToDo

    System.out.println("ѕроитерировать список по индексу и отпечатать слова в консоль через пробел");
    for (int i = 0; i < noddles.size(); i++) {
      System.out.printf(noddles.get(i) + " ");
    }
  }
}
