package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Elements {

  public static void main(String[] args) {

    List<String> elements = new ArrayList<>();
    elements.add("Text field");
    elements.add("Radio");
    elements.add("Check-box");
    elements.add("Drop-down");
    elements.add("Picker");
    elements.add("Breadcrumb");

    System.out.println("Проитерировать список через for-each и отпечатать слова в консоль через пробел");
    for (String elem : elements) {
      System.out.printf(elem + " ");
    }
    System.out.println();

    System.out.println("Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль");
    int counter = countElemsWithSeveralWords(elements);
    System.out.println("Количество названий элементов более, чем из одного слова: " + counter);

    System.out.println("Проитерировать список по индексу и отпечатать слова в консоль через пробел");
    for (int i = 0; i < elements.size(); i++) {
      System.out.printf(elements.get(i) + " ");
    }
    System.out.println();

    System.out.println("На 4-ю позицию добавить Spinner");
    elements.add(3, "Spinner");
    System.out.println(elements);

    System.out.println("Удалить 2-й элемент списка");
    elements.remove(1);
    System.out.println(elements);

    System.out.println("Заменить 5-й элемент на Switch");
    elements.set(4, "Switch");
    System.out.println(elements);

    System.out.println("Проитерировать список через for-each и отпечатать слова в консоль через пробел");
    for (String elem : elements) {
      System.out.printf(elem + " ");
    }
  }

  public static int countElemsWithSeveralWords(List list) {
    int counter = 0;
    String spaces = " ";
    String dash = "-";
    for (Object s : list) {
      if (s.toString().contains(spaces) || s.toString().contains(dash)) {
        counter++;
      }
    }
    return counter;
  }
}
