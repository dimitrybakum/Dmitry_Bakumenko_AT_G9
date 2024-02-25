package homework.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Auto {
  // 4.
  public static void main(String[] args) {
      // ������� ����� ����� �������� cars �� 7 ���� (����, ����, ������, ����, ������, ������, ����) (����� new ArrayList)

      List<String> mySetItem = new ArrayList<>();

      String[] stringArr = "����, ����, ������, ����, ������, ������, ����".split(", ");

      for (String i : stringArr) {
          (mySetItem).add(i);
      }

      // �������������� ������ ����� for-each � ���������� ����� � ���� cars ����� � ����� ������ � ��������
      try (FileWriter fileWriter = new FileWriter("auto.txt")) {
          for (String auto : mySetItem) {
              fileWriter.write(STR."\'\{auto}\'\n");
          }
          System.out.println("���� ���� �������� � ���� auto.txt");
      } catch (IOException e) {
          System.out.println("������ ��� ������ � ����: " + e.getMessage());
      }
      readFromFile();

      // ����� � ������� �� ������ ����, � �������� ������� ������ 4 ����
      Iterator<String> iterator = mySetItem.iterator();
      while (iterator.hasNext()) {
          if(iterator.next().length() > 4){
              iterator.remove();
          }

      }
      System.out.println(mySetItem);

      // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������
      System.out.println("~~!!!!!!!!!!!!!!!!");
      String str  = "";
      for (String i : mySetItem) {
          str  += i + " ";

      }
      System.out.println(str);
  }
    public static void readFromFile() {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("auto.txt"));
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
