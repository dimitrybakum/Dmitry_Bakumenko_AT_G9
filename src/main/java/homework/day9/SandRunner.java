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
    sandbox.add(new Sand(12, "������"));
    sandbox.add(new Sand(8, "������"));
    sandbox.add(new Sand(15, "���������"));
    sandbox.add(new Sand(7, "���������"));
    sandbox.add(new Sand(11, "������"));

    HashMap<Integer, String> myMap =
        new HashMap<>(
            sandbox.stream()
                .filter(sand -> sand.getName().contains("�") && sand.getWeight() > 9)
                .collect(
                    Collectors.toMap(
                        sand -> sand.getWeight() * 2, sand -> sand.getName().toUpperCase())));
    try (FileWriter fileWriter = new FileWriter("sands.txt")) {
      fileWriter.write(String.valueOf(myMap));
      System.out.println("������ ���� �������� � ���� sands.txt");
    } catch (IOException e) {
      System.out.println("������ ��� ������ � ����: " + e.getMessage());
    }
    readFromFile("sands.txt");
  }
}
