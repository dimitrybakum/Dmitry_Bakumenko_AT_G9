package homework.day8;

import java.util.*;

public class Numbers {
  // 8.
  public static void main(String[] args) {

    // Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через
    // (Arrays.asList())
    System.out.println("Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())");
    List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);
    System.out.println(numbers);
    // Проитерировать список через for-each и отпечатать числа в консоль новой строки
    System.out.println("Проитерировать список через for-each и отпечатать числа в консоль новой строки");
    for (int num : numbers) {
      System.out.println(num);
    }
    // Посчитать сумму всех чисел и вывести результат в консоль
    System.out.println("Посчитать сумму всех чисел и вывести результат в консоль");
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    System.out.println(sum);
    // Отсортировать список по возрастанию
    numbers.sort(null);
    // Проитерировать список по индексу и отпечатать числа в консоль через пробел
    System.out.println("Проитерировать список по индексу и отпечатать числа в консоль через пробел");
    String resultStr = "";
    for (int i = 0; i < numbers.size(); i++) {
      resultStr += numbers.get(i) + " ";
    }
    System.out.println(resultStr);
    // Развернуть список в обратном порядке
    System.out.println("Развернуть список в обратном порядке");
    Collections.reverse(numbers);
    System.out.println(numbers);
    // Проитерировать список через for-each и отпечатать числа в консоль через пробел
    System.out.println("Проитерировать список через for-each и отпечатать числа в консоль через пробел");
    String resultStrX = "";
    for (int num : numbers) {
      resultStrX += num + " ";
    }
    System.out.println(resultStrX);
  }
}
