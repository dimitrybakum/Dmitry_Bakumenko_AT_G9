package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Birds {
  // 6.
  public static void main(String[] args) {

    // Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через
    // (Arrays.asList())
    List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

    // Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде
    // --Чайка--
    for (String bird : birds) {
      System.out.println("--" + bird + "--");
    }
    // Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
    int counter = 0;
    for (String bird : birds) {
      // Подсчитываем количество гласных
      int vowelsCount = countVowels(bird);
      // Если количество гласных больше 1, увеличиваем счетчик
      if (vowelsCount > 1) {
        counter++;
      }
    }

    // Выводим результат
    System.out.println("Количество птиц с более чем 1 гласной: " + counter);

    // Проитерировать список по индексу и отпечатать слова в консоль через пробел
    String resultString = "";
    for (String bird : birds) {
      resultString += bird + " ";
    }

    System.out.println(resultString);
    // Заменить 3-й элемент списка на Синица
    birds.set(2, "Синица");

    // Проитерировать список через for-each и отпечатать слова в консоль через пробел
    String resultString2 = "";
    for (String bird : birds) {
      resultString2 += bird + " ";
    }
    System.out.println(resultString2);
  }
  public static int countVowels(String word) {
    int counter = 0;
    String vowels = "аеиоуэюя";
    // Проверяем каждый символ в слове
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      // Если символ является гласной, увеличиваем счетчик
      if (vowels.indexOf(ch) >= 0) {
        counter++;
      }
    }
    return counter;
  }
}
