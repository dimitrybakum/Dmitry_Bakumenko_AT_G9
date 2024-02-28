package homework.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static homework.day8.FileReader.readFromFile;


public class Auto {
  public static void main(String[] args) {
      System.out.println("������� ����� ����� �������� cars �� 7 ���� (����, ����, ������, ����, ������, ������, ����) (����� new ArrayList)");

      List<String> carList = new ArrayList<>();
      carList.add("����");
      carList.add("����");
      carList.add("������");
      carList.add("����");
      carList.add("������");
      carList.add("������");
      carList.add("����");


      System.out.println("�������������� ������ ����� for-each � ���������� ����� � ���� cars ����� � ����� ������ � ��������");
      try (FileWriter fileWriter = new FileWriter("cars.txt")) {
          for (String car : carList) {
              fileWriter.write(STR."\'\{car}\'\n");
          }
          System.out.println("���� ���� �������� � ���� auto.txt");
      } catch (IOException e) {
          System.out.println("������ ��� ������ � ����: " + e.getMessage());
      }
      readFromFile("cars.txt");


      System.out.println("����� � ������� �� ������ ����, � �������� ������� ������ 4 ����");
      Iterator<String> iterator = carList.iterator();
      while (iterator.hasNext()) {
          if(iterator.next().length() > 4){
              iterator.remove();
          }

      }
      System.out.println(carList);


      System.out.println("�������������� ������ ����� for-each � ���������� ����� � ������� ����� ������");
      String str  = "";
      for (String car : carList) {
          str  += car + " ";
      }
      System.out.println(str);
  }
}
