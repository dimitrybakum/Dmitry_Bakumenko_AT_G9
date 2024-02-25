package homework.day8.pack;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.valueOf;

// 11.x
public class Bubble {
  private int volume;
  private String name;

  public Bubble(int volume, String name) {
    this.volume = volume;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Bubble{" +
            "volume=" + volume +
            ", name='" + name + '\'' +
            '}';
  }

  public static void main(String[] args) {
    // ������� ������ ������� (������ Bubble) bubbles �� 3 ��������� � �������� (2, 4, 5) � �������
    // (CO2, O2, CO) ��������������, ����� (Arrays.asList())
    List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

    // �������������� ������ ����� for-each � ���������� ������ � ������� ����� ������
    for (Bubble bubble : bubbles) {
      System.out.printf(bubble.getVolume() + " ");
    }
    System.out.println();

    // �������������� ������ ����� for-each � ���������� ����� � ������� ����� ������
    for (Bubble bubble : bubbles) {
      System.out.printf(bubble.getName() + " ");
    }
    System.out.println();

    // ��������� ����� ���� ������� � ������� ����� � �������
    int allVolumes = 0;
    for (Bubble bubble : bubbles) {
      allVolumes += bubble.getVolume();
    }
    System.out.printf(valueOf(allVolumes));
    System.out.println();

    // �������������� ������ �� ������� � ���������� ������ (.toString()) � ������� � ����� ������
    for (int i = 0; i < bubbles.size(); i++) {
      System.out.println(bubbles.get(i).toString());
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
