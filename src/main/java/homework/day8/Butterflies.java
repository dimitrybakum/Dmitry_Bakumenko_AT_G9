package homework.day8;

import org.w3c.dom.css.Counter;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
  public static void main(String[] args) {
    // —оздать пустой список стрингов butterflies (через new ArrayList)
    // ƒобавить в список 4 бабочек (Common blue, Swallowtail, Aglais io, Common blue)
    // ѕроитерировать список через for-each и отпечатать слова в консоль в кавычках
    // ѕосчитать сколько бабочек содержат букву "о" и вывести число в консоль
    // ѕроитерировать список по индексу и отпечатать слова в консоль через пробел
    // ѕроитерировать список через for-each и отпечатать слова в консоль через перенос строки
    String[] stringArr = "Common blue, Swallowtail, Aglais io, Common blue".split(", ");

    List<String> butterfliesList = new ArrayList<>();

    for (int i = 0; i < stringArr.length; i++) {
      butterfliesList.add(stringArr[i]);
    }

    System.out.println();
    for (int i = 0; i < butterfliesList.size(); i++) {
      System.out.println(butterfliesList.get(i));
    }
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // ѕроитерировать список через for-each и отпечатать слова в консоль в кавычках
    for (String i : butterfliesList) {
      System.out.println("'" + i + "'");
    }
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // ѕосчитать сколько бабочек содержат букву "о" и вывести число в консоль
    int count = 0;
    for (String butterfly : butterfliesList) {
      if (butterfly.toLowerCase().contains("o")) {
        count++;
      }
    }
    System.out.println(" оличество бабочек, содержащих букву 'о': " + count);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // ѕроитерировать список по индексу и отпечатать слова в консоль через пробел
    String resultString = "";
    for (String i : butterfliesList) {
      resultString += i + " ";
    }
    System.out.printf(resultString).println();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    //// ѕроитерировать список через for-each и отпечатать слова в консоль через перенос строки
    for (String i : butterfliesList) {
      System.out.println(i + "\n");
    }
  }
}
