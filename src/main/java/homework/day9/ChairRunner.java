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
        "ќтфильтровать только те стуль€, который выше или равны 100 и уже или равны 50");
    Stream<Chair> furniture =
        Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(100, 55), new Chair(110, 45));
    furniture
        .filter(chair -> chair.getHeight() >= 100 && chair.getWidth() <= 50)
        .forEach(System.out::println);

    System.out.println(
        "ќтсортировать по высоте, а если высота равна, то по ширине в нисход€щем пор€дке");
    Stream<Chair> furniture2 =
        Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(110, 50), new Chair(110, 45));
    furniture2
        .sorted(
            Comparator.comparingInt(Chair::getHeight).thenComparingInt(Chair::getWidth).reversed())
        .forEach(System.out::println);

    System.out.println(
        "Ќа основании существующего потока данных создать новый, в котором каждый новый Chair "
            + "имеет высоту, деленную на 2, и ширину, умноженную на случайное число от 3 до 8 включительно");
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
        "Ќа основании получившегос€ потока данных создать новый, представл€ющий "
            + "собой уникальный набор высот стульев умноженных на их ширину");
    Stream<Chair> furniture4 =
        Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(100, 50), new Chair(110, 45));
    furniture4.map(chair -> chair.getWidth() * chair.getHeight()).forEach(System.out::println);

    System.out.println("Ќайти наибольшее значение в получившемс€ потоке");
    Stream<Chair> furniture5 =
        Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(100, 50), new Chair(110, 45));
    int maxVolume =
        furniture5.mapToInt(chair -> chair.getHeight() * chair.getWidth()).max().orElse(0);

    System.out.println(maxVolume);

    System.out.println(
        "—оздать новый обьект Bubble с обьемом равным найденному наибольшему значению "
            + "и именем равным найденному наибольшему значению, представленным в виде словесного выражени€ каждой цифры"
            + "числа этого значени€, указанного чере пробел");

    Bubble bubble =
        new Bubble(
            maxVolume,
            String.valueOf(maxVolume)
                .chars()
                .mapToObj(
                    ch -> {
                      return switch (ch) {
                        case '0' -> "ноль";
                        case '1' -> "один";
                        case '2' -> "два";
                        case '3' -> "три";
                        case '4' -> "четыре";
                        case '5' -> "п€ть";
                        case '6' -> "шесть";
                        case '7' -> "семь";
                        case '8' -> "восемь";
                        case '9' -> "дев€ть";
                        default -> "";
                      };
                    })
                .collect(Collectors.joining(" ")));
    System.out.println(bubble);

    System.out.println("Ќапечатать строковое значение полученного обьекта в текстовый файл");
    try (FileWriter writer = new FileWriter("chairs.txt")) {
      writer.write(bubble.getName());
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
    readFromFile("chairs.txt");
  }
}
