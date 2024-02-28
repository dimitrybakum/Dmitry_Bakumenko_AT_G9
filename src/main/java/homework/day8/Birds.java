package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Birds {
  public static void main(String[] args) {

    System.out.println(
        "Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())");
    List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

    System.out.println(
        "Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--");
    for (String bird : birds) {
      System.out.println("--" + bird + "--");
    }
    System.out.println();

    System.out.println(
        "Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль");
    int count = countBirdsWithMultipleVowels(birds);
    System.out.println("Количество птиц с более чем одной гласной: " + count);
    System.out.println();

    System.out.println(
        "Проитерировать список по индексу и отпечатать слова в консоль через пробел");

    for (int i = 0; i < birds.size(); i++) {
      System.out.printf(birds.get(i) + " ");
    }
    System.out.println();

    System.out.println("Заменить 3-й элемент списка на Синица");
    birds.set(2, "Синица");

    System.out.println(
        "Проитерировать список через for-each и отпечатать слова в консоль через пробел");
    for (String bird : birds) {
      System.out.printf(bird + " ");
    }
  }

  public static int countBirdsWithMultipleVowels(List<String> birds) {
    int count = 0;
    String vowels = "аеиоуэюяАЕИОУЭЮЯ";
    for (String bird : birds) {
      int vowelCount = 0;
      for (int i = 0; i < bird.length(); i++) {
        char ch = bird.charAt(i);
        if (vowels.indexOf(ch) >= 0) {
          vowelCount++;
        }
      }
      if (vowelCount > 1) {
        count++;
      }
    }
    return count;
  }
}
