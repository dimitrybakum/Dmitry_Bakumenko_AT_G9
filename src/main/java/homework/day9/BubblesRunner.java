package homework.day9;

import homework.day8.pack.Bubble;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BubblesRunner {
  public static void main(String[] args) {
    List<Bubble> bubbles =
        Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

    System.out.println("� ������ ������ ������������� ������ �� ������, ����� ������� ������ 3");
    Stream<Bubble> streamBubbles = bubbles.stream();

    System.out.println(
        streamBubbles
            .mapToInt(Bubble::getVolume)
            .filter(e -> e > 3)
            .peek(e -> System.out.println("Filtered value: " + e))
            .boxed()
            .collect(Collectors.toList()));

    System.out.println("������������� ������ �� ����� � ���������� �������");
    Stream<Bubble> streamBubbles2 = bubbles.stream();
    streamBubbles2.forEach(name -> System.out.println(name.getName()));

    System.out.println("�� ��������� ������������� ������ ������ ������� �����, � ������� ������ ����� Bubble ����� ����� � 3 ���� ������ ���������");
    Stream<Bubble> streamBubbles3 = bubbles.stream();
    System.out.println(streamBubbles3.peek(bubble -> bubble.setVolume(bubble.getVolume() * 3)).collect(Collectors.toList()));
  }
}
