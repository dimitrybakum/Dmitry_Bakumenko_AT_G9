package homework.day8.pack;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// 13.
public class Water {
  private String color;
  private String smell;

  public Water(String color, String smell) {
    this.color = color;
    this.smell = smell;
  }

  public static void main(String[] args) {
    // Создать список воды (класса Water) water из 3 объектов воды
    // с цветом (Прозрачная, Прозрачная, Мутная)
    // и запахом (Нет, Нет, Аммиачный) соответственно,
    // через (Arrays.asList())
    List<Water> waters =
        Arrays.asList(
            new Water("Прозрачная", "Нет"),
            new Water("Прозрачная", "Нет"),
            new Water("Мутная", "Аммиачный"));
    System.out.println(waters);
    // Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой
    // строки
    for (Water water : waters) {
      System.out.println(water.getColor() + "-" + water.getSmell());
    }
  }

  @Override
  public String toString() {
    return "Water{" + "color='" + color + '\'' + ", smell='" + smell + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Water water = (Water) o;
    return Objects.equals(getColor(), water.getColor())
        && Objects.equals(getSmell(), water.getSmell());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getColor(), getSmell());
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getSmell() {
    return smell;
  }

  public void setSmell(String smell) {
    this.smell = smell;
  }
}
