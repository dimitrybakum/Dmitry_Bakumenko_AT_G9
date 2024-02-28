package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
  public static void main(String[] args) {

    List<String> butterfliesList = new ArrayList<>();
    butterfliesList.add("Common blue");
    butterfliesList.add("Swallowtail");
    butterfliesList.add("Aglais io");
    butterfliesList.add("Common blue");

    System.out.println();

    System.out.println(
        "ѕроитерировать список через for-each и отпечатать слова в консоль в кавычках");
    for (String butterfly : butterfliesList) {
      System.out.println("'" + butterfly + "'");
    }

    System.out.println("ѕосчитать сколько бабочек содержат букву \"о\" и вывести число в консоль");
    int count = 0;
    for (String butterfly : butterfliesList) {
      if (butterfly.toLowerCase().contains("o")) {
        count++;
      }
    }
    System.out.println(" оличество бабочек, содержащих букву 'о': " + count);

    System.out.println(
        "ѕроитерировать список по индексу и отпечатать слова в консоль через пробел");
    for (int i = 0; i < butterfliesList.size(); i++) {
      System.out.printf(butterfliesList.get(i) + " ");
    }
    System.out.println();

    System.out.println(
        "ѕроитерировать список через for-each и отпечатать слова в консоль через перенос строки\n");
    for (String butterfly : butterfliesList) {
      System.out.println(butterfly);
    }
  }
}
