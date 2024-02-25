package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Elements {
  // 7.


  public static void main(String[] args) {

    // Создать пустой список стрингов elements (через new ArrayList)

    List<String> elements = new ArrayList<>();
    // Добавить в список 6 элементов (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
    String[] elems = {"Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb"};
    for (String elem : elems) {
      elements.add(elem);
    }
    System.out.println(elements);

    // Проитерировать список через for-each и отпечатать слова в консоль через пробел
    for (String elem : elements) {
      String resultStr = "";
      System.out.printf(resultStr + (elem + " "));
    }
    // Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в
    // консоль
    int counter = 0;
    for (String elem : elements) {
      // Подсчитываем количество гласных
      int vowelsCount = countSpaces(elem);
      // Если количество гласных больше 1, увеличиваем счетчик
      if (vowelsCount > 0) {
        counter++;
      }
    }
    System.out.println();
    System.out.println("Количество елементов с пробелом: " + counter);
    // Проитерировать список по индексу и отпечатать слова в консоль через пробел

    String resultStr = "";
    for (String i : elements) {
      resultStr  += i + " ";

    }
    System.out.println(resultStr);
    // На 4-ю позицию добавить Spinner
    elements.add(3, "Spinner");
    System.out.println(elements);
    // Удалить 2-й элемент списка
    elements.remove(1);
    System.out.println(elements);
    // Заменить 5-й элемент на Switch
    elements.set(4, "Switch");
    System.out.println(elements);
    // Проитерировать список через for-each и отпечатать слова в консоль через пробел
    for (String elem : elements) {
      String resultStr2 = "";
      System.out.printf(resultStr2 + (elem + " "));
    }
  }

  public static int countSpaces(String word) {
    int counter = 0;
    String spaces = " ";
      if (word.contains(spaces)) {
        counter++;
      }
      return counter;
  }
}