package classwork.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMap {

  public static void main(String[] args) {

    // String str = "мама мыла раму мыла";
    String[] stringArr = "мама мыла раму мыла".split(" ");

    Map<Integer, String> myMap = new HashMap<>();

    for (int i = 0; i < stringArr.length; i++) {
      myMap.put(i, stringArr[i]);
    }

    for (int i : myMap.keySet()) {
      System.out.println(i);
    }
    for (String i : myMap.values()) {
      System.out.println(i);
    }
    for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
      System.out.printf("key = %s, value = %s", entry.getKey(), entry.getValue()).println();
    }

  }
}
