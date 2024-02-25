package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyCollections {

  public static void main(String[] args) {

    //String str = "мама мыла раму мыла";
    String[] stringArr = "мама мыла раму мыла".split(" ");

    List<String> myList = new ArrayList<>();

    for (int i = 0; i < stringArr.length; i++) {
      myList.add(stringArr[i]);
    }

    System.out.println();
    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }

    System.out.println();

    for (String i : myList) {
      System.out.println(i);
    }
  }
}
