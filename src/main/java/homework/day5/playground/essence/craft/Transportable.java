package homework.day5.playground.essence.craft;

public interface Transportable {
  default int move(int pointA, int pointB) {
    String text =
        String.format(
            "{I am %s, my name is %s and I am moving from point %d to point %d}",
            getClass().getSimpleName(),
            this.getName(),
            pointA,
            pointB); // ?????????????????????????????
    // А и В - числа, подставляемые из значения передаваемых аргументов, и возвращает целое число,
    // являющееся разницей В и А
    System.out.println(text);
    return pointB - pointA;
  }

  Object getName();
  // перемещающие (Transportable): воздушные транспортные стредства, наземные транспортные стредства
}
