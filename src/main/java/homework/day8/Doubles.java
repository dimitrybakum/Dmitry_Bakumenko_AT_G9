package homework.day8;

import java.util.Arrays;
import java.util.List;

import static java.lang.Double.valueOf;

public class Doubles {
  // 9.
  public static void main(String[] args) {

    // —оздать список дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5,
    // 769.9) через (Arrays.asList())
    System.out.println("—оздать список дробных чисел doubles из 8 чисел через (Arrays.asList())");
    List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
    System.out.println(doubles);
    // ѕроитерировать список через for-each и отпечатать числа в консоль через пробел
    System.out.println(
        "ѕроитерировать список через for-each и отпечатать числа в консоль через пробел");
    for (Double myDouble : doubles) {
      System.out.printf(myDouble + " ");
    }
    System.out.println();
    // ѕосчитать произведение всех чисел и вывести результат в консоль
    System.out.println("ѕосчитать произведение всех чисел и вывести результат в консоль");
    Double multResult = 1.0;
    for (double num : doubles) {
      multResult *= num;
    }
    System.out.println(multResult);
    // найти сумму всех дробных частей и вывести результат в консоль
    System.out.println("найти сумму всех дробных частей и вывести результат в консоль");
    double sumOfFloats = 0.0;
    for (double num : doubles) {
      sumOfFloats += num - Math.floor(num);
    }
    System.out.println(sumOfFloats);
    // ѕроитерировать список по индексу и вывести целые части в консоль через пробел
    System.out.println("ѕроитерировать список по индексу и вывести целые части в консоль через пробел");
    double whole = 0;
    for (int i = 0; i < doubles.size(); i++) {
      System.out.printf(Math.floor(doubles.get(i)) + " ");
    }
  }//Math.floor(doubles.get(i))
}
