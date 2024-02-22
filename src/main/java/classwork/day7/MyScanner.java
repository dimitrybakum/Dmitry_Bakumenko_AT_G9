package classwork.day7;

import java.util.Scanner;

public class MyScanner {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);

    while (myScanner.hasNext()) {
      String incoming = myScanner.nextLine();
      if (incoming.equalsIgnoreCase("stop")) {
        return;
      }
      System.out.printf("Just got %s", incoming).println();
    }
  }
}
