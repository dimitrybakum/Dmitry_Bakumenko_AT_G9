package homework.day9;

import homework.day8.pack.Sand;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.*;

import static homework.day8.FileReader.readFromFile;

public class SandRunner {
  public static void main(String[] args) throws IOException {
    List<Sand> sandbox = new ArrayList<>();
    sandbox.add(new Sand(12, "Речной"));
    sandbox.add(new Sand(8, "Речной"));
    sandbox.add(new Sand(15, "Карьерный"));
    sandbox.add(new Sand(7, "Карьерный"));
    sandbox.add(new Sand(11, "Речной"));

    HashMap<Integer, String> myMap =
        new HashMap<>(
            sandbox.stream()
                .filter(sand -> sand.getName().contains("ч") && sand.getWeight() > 9)
                .collect(
                    Collectors.toMap(
                        sand -> sand.getWeight() * 2, sand -> sand.getName().toUpperCase())));
    try (FileWriter fileWriter = new FileWriter("sands.txt")) {
      fileWriter.write(String.valueOf(myMap));
      System.out.println("Данные были записаны в файл sands.txt");
    } catch (IOException e) {
      System.out.println("Ошибка при записи в файл: " + e.getMessage());
    }
    readFromFile("sands.txt");
  }
}
