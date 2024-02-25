package homework.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Noodles {
  // 10.
  public static void main(String[] args) {

    //
    // —оздать пустой список стрингов noodles (через new ArrayList)
    List<String> noddles = new ArrayList<>();

    // ƒобавить в список 4 вида макарон (стринги Hakka, Ramen, Hibachi, Schezwan)
    String[] noodlesTypes = {"Hakka", "Ramen", "Hibachi", "Schezwan"};
    for (String elem : noodlesTypes) {
      noddles.add(elem);
    }
    System.out.println(noddles);
    // ѕроитерировать список через for-each и отпечатать слова в консоль через тире
    for (String n : noddles) {
        String str = "";
        str += n + "-";
        System.out.printf(str);
    }
    // «аменить в каждом слове буквы "а" на букву "о"

    // ѕроитерировать список по индексу и отпечатать слова в консоль через пробел
  }
}
