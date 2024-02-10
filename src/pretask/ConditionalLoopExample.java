package pretask;

public class ConditionalLoopExample {
  public static void main(String[] args) {
    // - класс ConditionalLoopExample, используйте цикл for, чтобы вывести четные числа от 1 до 10,
    // с использованием условного оператора if для пропуска нечетных чисел;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 != 1) {
        System.out.println(i);
      }
    }
  }
}
