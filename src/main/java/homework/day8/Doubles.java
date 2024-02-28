package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Doubles {
  public static void main(String[] args) {

    List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);


    System.out.println("ѕроитерировать список через for-each и отпечатать числа в консоль через пробел");
    for (Double myDouble : doubles) {
      System.out.printf(myDouble + " ");
    }
    System.out.println();

    System.out.println("ѕосчитать произведение всех чисел и вывести результат в консоль");
    double multResult = 1.0;
    for (double num : doubles) {
      multResult *= num;
    }
    System.out.println(multResult);

    System.out.println("найти сумму всех дробных частей и вывести результат в консоль");
    double sumOfFloats = 0.0;
    for (double num : doubles) {
      sumOfFloats += num - Math.floor(num);
    }
    System.out.println(sumOfFloats);

    System.out.println("ѕроитерировать список по индексу и вывести целые части в консоль через пробел");
    double whole = 0;
    for (int i = 0; i < doubles.size(); i++) {
      System.out.printf(Math.floor(doubles.get(i)) + " ");
    }
  }
}
