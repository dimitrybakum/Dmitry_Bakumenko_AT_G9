package classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyCollection2 {

  public static void main(String[] args) {

    List<String> arrayList = new ArrayList<>();
    List<String> linkedList = new LinkedList<>();

    long t0 = System.currentTimeMillis();
    for (int i = 0; i < 200000000; i++) {// 50 000 000
      arrayList.add("строка");
    }
    System.out.println(System.currentTimeMillis() - t0);

    long t1 = System.currentTimeMillis();
    for (int i = 0; i < 200000000; i++) {// 50 000 000
      linkedList.add("строка");
    }
    System.out.println(System.currentTimeMillis() - t1);
  }
}
