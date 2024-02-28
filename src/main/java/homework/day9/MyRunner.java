package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class MyRunner {
  // 0.1 пользуемс€ классами обьектов из задани€ по коллекци€м (Bubble, Person, Water, Sand, Chair)
  // 0.2 каждое задание делаем только со стримом и в виде одного оператора (одна цепочка методов
  // вызова через точку)
  // 0.3 каждое задание делаем в отдельном классе *Runner, напрмер, ButterfliesRunner, с собственным
  // main методом
  //
  // 1.
  // —оздать пустой список стрингов butterflies (через new ArrayList)
  // ƒобавить в список 4 бабочки (Common blue, Swallowtail, Aglais io, Common blue)
  // ƒобавить к каждому элементу кавычки
  // ќставить только те слова, которые содержат букву "a" и букву "о"
  // ¬ывести слова в консоль с новой строки
  public static void main(String[] args) {
    List<String> butterflies = new ArrayList<>();
    butterflies.add("Common blue");
    butterflies.add("Swallowtail");
    butterflies.add("Aglais io");
    butterflies.add("Common blue");

    //System.out.println(butterflies.getFirst().);
  }
}
