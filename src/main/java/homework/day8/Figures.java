package homework.day8;

import homework.day5.playground.essence.craft.field.types.Car;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Figures {
  // 2.

  public static void main(String[] args) throws IOException {
    // ������� ������ ����� �������� figures �� 5 ����� (����, �������������, ����, �������, ������)
    // ����� (Arrays.asList())

    List<String> figures = Arrays.asList("����", "�������������", "����", "�������", "������");

    // �������������� ������ ����� for-each � ���������� ����� � ���� figures ����� ����
    try (FileWriter fileWriter = new FileWriter("figures.txt")) {
      for (String figure : figures) {
        fileWriter.write(figure + "-");
      }
      System.out.println("������ ���� �������� � ���� figures.txt");
    } catch (IOException e) {
      System.out.println("������ ��� ������ � ����: " + e.getMessage());
    }
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    readFromFile();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // ��������� ������� ����� �� �������� ����� "�" � ������� ����� � �������
    int count = 0;
    for (String f : figures) {
      if (!f.toLowerCase().contains("�")) {
        count++;
      }
    }
    System.out.println("���������� �����, �� ���������� ����� '�': " + count);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // �������������� ������ �� ������� � ���������� ����� � ������� ����� ������
    String resultString = "";
    for (String i : figures) {
      resultString += i + " ";
    }
    System.out.printf(resultString).println();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // �������� �� 3 ������� �����������
    String triangle = "�����������";
    figures.set(2, triangle);
    System.out.println(figures);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������
    String resultString2 = "";
    for (String f : figures) {
      resultString2 += f + " ";
    }

    System.out.println(resultString2);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  }

  public static void readFromFile() {
    try {
      BufferedReader fileReader = new BufferedReader(new FileReader("figures.txt"));
      String line = fileReader.readLine();
      while (line != null) {
        System.out.println("fileReader: " + line);
        line = fileReader.readLine();
      }
      fileReader.close();
    } catch (IOException e) {
      System.out.println("������ ��� ������ �� �����: " + e.getMessage());
    }
  }
}
