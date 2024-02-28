package homework.day8;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import static homework.day8.FileReader.readFromFile;

public class Figures {
  public static void main(String[] args) throws IOException {

    List<String> figures = Arrays.asList("����", "�������������", "����", "�������", "������");

    System.out.println("�������������� ������ ����� for-each � ���������� ����� � ���� figures ����� ����");
    try (FileWriter fileWriter = new FileWriter("figures.txt")) {
      for (String figure : figures) {
        fileWriter.write(figure + "-");
      }
      System.out.println("������ ���� �������� � ���� figures.txt");
    } catch (IOException e) {
      System.out.println("������ ��� ������ � ����: " + e.getMessage());
    }
    readFromFile("figures.txt");

    System.out.println("��������� ������� ����� �� �������� ����� \"�\" � ������� ����� � �������");
    int count = 0;
    for (String figure : figures) {
      if (!figure.toLowerCase().contains("�")) {
        count++;
      }
    }
    System.out.println("���������� �����, �� ���������� ����� '�': " + count);

    System.out.println("�������������� ������ �� ������� � ���������� ����� � ������� ����� ������");
    for (int i = 0; i < figures.size(); i++) {
      System.out.printf(figures.get(i) + " ");
    }
    System.out.println();

    System.out.println("�������� �� 3 ������� �����������");
    // ToDo
    // figures.add(2, "�����������");
    // System.out.println(figures);

    System.out.println("�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������");
    for (String figure : figures) {
      System.out.printf(figure + " ");
    }
  }
}
