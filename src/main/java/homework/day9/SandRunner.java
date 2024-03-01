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

    System.out.println(
        "������������� ������ ��� �����, ������� ����� ������ 9 � ��� �������� �������� ����� \"�\"");
    System.out.println(
        sandbox.stream()
            .filter(sand -> sand.getName().contains("�") && sand.getWeight() > 9)
            .collect(Collectors.toList()));

    System.out.println("������������� �� ���� � ���������� �������");
    sandbox.stream().mapToInt(Sand::getWeight).sorted().forEach(System.out::println);

    System.out.println(
        "�� ��������� ������������� ������ ������ ������� �����, � ������� ������ ����� "
            + "Sand ����� ��� ���������� �� 2, � ��� � ������� ��������");
    sandbox.stream()
        .map(
            sand -> {
              String name = sand.getName();
              if (name.contains("�")) name = name.replace("�", "��");
              return new Sand(sand.getWeight() * 2, name.toUpperCase());
            })
        .forEach(System.out::println);

    System.out.println(
        "�� ��������� ������������� ������ ������ ������� ��������� Map, ��� ���� - ��� ���, � �������� - ���");
    Stream<HashMap<Integer, String>> streams =
        sandbox.stream()
            .map(
                sand -> {
                  String name = sand.getName();
                  int weight = sand.getWeight();
                  if (name.contains("�")) name = name.replace("�", "��");
                  if (weight > 0) weight *= 2;
                  HashMap<Integer, String> sandMap = new HashMap<>();
                  sandMap.put(weight, name.toUpperCase());
                  return sandMap;
                });
    System.out.println(streams.collect(Collectors.toList()));

    System.out.println("���������� ������ �� ��������� ����� � ���� value:key � ��������� ����");
    try (FileWriter fileWriter = new FileWriter("sands.txt")) {
      for (Sand sand : sandbox) {
        String name = sand.getName();
        int weight = sand.getWeight();
        if (name.contains("�")) name = name.replace("�", "��");
        if (weight > 0) weight *= 2;
        fileWriter.write(weight + ":" + name.toUpperCase() + "\n");
      }
      System.out.println("������ ���� �������� � ���� sands.txt");
    } catch (IOException e) {
      System.out.println("������ ��� ������ � ����: " + e.getMessage());
    }
    readFromFile("sands.txt");
  }
}
