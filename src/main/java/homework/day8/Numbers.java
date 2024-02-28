package homework.day8;

import java.util.*;

public class Numbers {
  public static void main(String[] args) {

    System.out.println("Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())");
    List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

    System.out.println("Проитерировать список через for-each и отпечатать числа в консоль новой строки");
    for (int num : numbers) {
      System.out.println(num);
    }

    System.out.println("Посчитать сумму всех чисел и вывести результат в консоль");
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    System.out.println(sum);

    System.out.println("Отсортировать список по возрастанию");
    numbers.sort(null);

    System.out.println("Проитерировать список по индексу и отпечатать числа в консоль через пробел");
    for (int i = 0; i < numbers.size(); i++) {
      System.out.printf(numbers.get(i) + " ");
    }
    System.out.println();

    System.out.println("Развернуть список в обратном порядке");
    Collections.reverse(numbers);

    System.out.println("Проитерировать список через for-each и отпечатать числа в консоль через пробел");
    for (int num : numbers) {
      System.out.printf(num + " ");
    }
  }
}
