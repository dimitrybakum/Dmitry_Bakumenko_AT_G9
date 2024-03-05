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

    Stream<Chair> furniture1 =
        Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(100, 55), new Chair(110, 45));

    int value =
        furniture1
            .filter(chair -> chair.getHeight() >= 100 && chair.getWidth() <= 50)
            .sorted(
                Comparator.comparingInt(Chair::getHeight)
                    .thenComparingInt(Chair::getWidth)
                    .reversed())
            .peek(
                chair -> {
                  chair.setHeight(chair.getHeight() / 2);
                  chair.setWidth((int) (chair.getWidth() * Math.TAU));
                })
            .map(chair -> chair.getWidth() * chair.getHeight())
            .max(Integer::compareTo)
            .orElse(0);

    Bubble bubble =
        new Bubble(
            value,
            String.valueOf(value)
                .chars()
                .mapToObj(
                    ch -> {
                      return switch (ch) {
                        case '0' -> "ноль";
                        case '1' -> "один";
                        case '2' -> "два";
                        case '3' -> "три";
                        case '4' -> "четыре";
                        case '5' -> "пять";
                        case '6' -> "шесть";
                        case '7' -> "семь";
                        case '8' -> "восемь";
                        case '9' -> "девять";
                        default -> "";
                      };
                    })
                .collect(Collectors.joining(" ")));
    System.out.println(bubble);

    try (FileWriter writer = new FileWriter("chairs.txt")) {
      writer.write(bubble.getName());
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
    readFromFile("chairs.txt");
  }
}
