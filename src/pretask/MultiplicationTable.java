package pretask;

public class MultiplicationTable {
  public static void main(String[] args) {
    // - класс MultiplicationTable, используя цикл for, выведите на экран таблицу умножения для
    // числа 5 (1  5, 2  5, и так далее);
    int FIVE = 5;
    for (int i = 1; i <= 5; i++) {

      int ans = i * FIVE;
      System.out.println(i + " x " + FIVE + " = " + ans);
    }
  }
}
