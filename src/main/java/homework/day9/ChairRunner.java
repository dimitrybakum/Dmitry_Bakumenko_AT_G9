package homework.day9;

import homework.day8.pack.Bubble;
import homework.day8.pack.Chair;
import homework.day8.pack.Sand;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static homework.day8.FileReader.readFromFile;

public class ChairRunner {
  public static void main(String[] args) {
    System.out.println(
        "������������� ������ �� ������, ������� ���� ��� ����� 100 � ��� ��� ����� 50");
    Stream<Chair> furniture =
        Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(100, 55), new Chair(110, 45));
    furniture
        .filter(chair -> chair.getHeight() >= 100 && chair.getWidth() <= 50)
        .forEach(System.out::println);

    System.out.println(
        "������������� �� ������, � ���� ������ �����, �� �� ������ � ���������� �������");
    Stream<Chair> furniture2 =
        Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(110, 50), new Chair(110, 45));
    furniture2
        .sorted(
            Comparator.comparingInt(Chair::getHeight).thenComparingInt(Chair::getWidth).reversed())
        .forEach(System.out::println);

    System.out.println(
        "�� ��������� ������������� ������ ������ ������� �����, � ������� ������ ����� Chair "
            + "����� ������, �������� �� 2, � ������, ���������� �� ��������� ����� �� 3 �� 8 ������������");
    Stream<Chair> furniture3 =
        Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(100, 50), new Chair(110, 45));
    furniture3
        .peek(
            chair -> {
              chair.setHeight(chair.getHeight() / 2);
              chair.setWidth((int) (chair.getWidth() * Math.TAU));
            })
        .forEach(System.out::println);

    System.out.println(
        "�� ��������� ������������� ������ ������ ������� �����, �������������� "
            + "����� ���������� ����� ����� ������� ���������� �� �� ������");
    Stream<Chair> furniture4 =
        Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(100, 50), new Chair(110, 45));
    furniture4.map(chair -> chair.getWidth() * chair.getHeight()).forEach(System.out::println);

    System.out.println("����� ���������� �������� � ������������ ������");
    Stream<Chair> furniture5 =
        Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(100, 50), new Chair(110, 45));
    int maxVolume =
        furniture5.mapToInt(chair -> chair.getHeight() * chair.getWidth()).max().orElse(0);

    System.out.println(maxVolume);

    System.out.println(
        "������� ����� ������ Bubble � ������� ������ ���������� ����������� �������� "
            + "� ������ ������ ���������� ����������� ��������, �������������� � ���� ���������� ��������� ������ �����"
            + "����� ����� ��������, ���������� ���� ������");

    Bubble bubble =
        new Bubble(
            maxVolume,
            String.valueOf(maxVolume)
                .chars()
                .mapToObj(
                    ch -> {
                      return switch (ch) {
                        case '0' -> "����";
                        case '1' -> "����";
                        case '2' -> "���";
                        case '3' -> "���";
                        case '4' -> "������";
                        case '5' -> "����";
                        case '6' -> "�����";
                        case '7' -> "����";
                        case '8' -> "������";
                        case '9' -> "������";
                        default -> "";
                      };
                    })
                .collect(Collectors.joining(" ")));
    System.out.println(bubble);

    System.out.println("���������� ��������� �������� ����������� ������� � ��������� ����");
    try (FileWriter writer = new FileWriter("chairs.txt")) {
      writer.write(bubble.getName());
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
    readFromFile("chairs.txt");
  }
}
