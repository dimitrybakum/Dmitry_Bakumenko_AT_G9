package homework.day8.pack;

import java.util.Arrays;
import java.util.List;

// 13.
public class Water {
  private String color;
  private String smell;

  public Water(String color, String smell) {
    this.color = color;
    this.smell = smell;
  }

  @Override
  public String toString() {
    return "Water{" + "color='" + color + '\'' + ", smell='" + smell + '\'' + '}';
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
