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

    System.out.println(
        "Отфильтровать только тот песок, который весит больше 9 и имя которого содержит букву \"ч\"");
    System.out.println(
        sandbox.stream()
            .filter(sand -> sand.getName().contains("ч") && sand.getWeight() > 9)
            .collect(Collectors.toList()));

    System.out.println("Отсортировать по весу в восходящем порядке");
    sandbox.stream().mapToInt(Sand::getWeight).sorted().forEach(System.out::println);

    System.out.println(
        "На основании существующего потока данных создать новый, в котором каждый новый "
            + "Sand имеет вес умноженный на 2, и имя в верхнем регистре");
    sandbox.stream()
        .map(
            sand -> {
              String name = sand.getName();
              if (name.contains("ы")) name = name.replace("ы", "ыы");
              return new Sand(sand.getWeight() * 2, name.toUpperCase());
            })
        .forEach(System.out::println);

    System.out.println(
        "На основании получившегося потока данных создать коллекцию Map, где ключ - это вес, а значение - имя");
    Stream<HashMap<Integer, String>> streams =
        sandbox.stream()
            .map(
                sand -> {
                  String name = sand.getName();
                  int weight = sand.getWeight();
                  if (name.contains("ы")) name = name.replace("ы", "ыы");
                  if (weight > 0) weight *= 2;
                  HashMap<Integer, String> sandMap = new HashMap<>();
                  sandMap.put(weight, name.toUpperCase());
                  return sandMap;
                });
    System.out.println(streams.collect(Collectors.toList()));

    System.out.println("Отпечатать каждый из элементов карты в виде value:key в текстовый файл");
    try (FileWriter fileWriter = new FileWriter("sands.txt")) {
      for (Sand sand : sandbox) {
        String name = sand.getName();
        int weight = sand.getWeight();
        if (name.contains("ы")) name = name.replace("ы", "ыы");
        if (weight > 0) weight *= 2;
        fileWriter.write(weight + ":" + name.toUpperCase() + "\n");
      }
      System.out.println("Данные были записаны в файл sands.txt");
    } catch (IOException e) {
      System.out.println("Ошибка при записи в файл: " + e.getMessage());
    }
    readFromFile("sands.txt");
  }
}
