package homework.day7;

import java.io.*;
import java.util.Scanner;
import homework.day5.playground.essence.craft.air.types.Copter;
import homework.day5.playground.essence.craft.air.types.Plane;
import homework.day5.playground.essence.craft.air.types.Rocket;
import homework.day5.playground.essence.craft.field.types.Car;
import homework.day5.playground.essence.craft.field.types.Moped;
import homework.day5.playground.essence.craft.field.types.Motorbike;
import homework.day5.playground.essence.craft.hand.types.Bottle;
import homework.day5.playground.essence.craft.hand.types.Can;
import homework.day5.playground.essence.craft.hand.types.Mug;
import homework.day5.playground.essence.creatures.flowers.types.Chamomile;
import homework.day5.playground.essence.creatures.flowers.types.Maylily;
import homework.day5.playground.essence.creatures.flowers.types.Rose;
import homework.day5.playground.essence.creatures.insects.types.Beetle;
import homework.day5.playground.essence.creatures.insects.types.Fly;
import homework.day5.playground.essence.creatures.insects.types.Mosquito;
import homework.day5.playground.essence.creatures.vegetable.type.Carrot;
import homework.day5.playground.essence.creatures.vegetable.type.Potato;
import homework.day5.playground.essence.creatures.vegetable.type.Radish;
import homework.day5.playground.essence.creatures.vertebratas.types.Crocodile;
import homework.day5.playground.essence.creatures.vertebratas.types.Pigeon;
import homework.day5.playground.essence.creatures.vertebratas.types.Raven;
import homework.day5.playground.essence.material.types.Diesel;
import homework.day5.playground.essence.material.types.Petrol;
import homework.day5.playground.essence.material.types.Water;

public class MyScanner4 {
  // - - читает текст из файла, убирает из него все согласные и записывает новый текст в тот же файл
  // в конец, через пустую строку ниже оригинал.

  public void main(String[] args) {
    MyScanner4 myScanner4 = new MyScanner4();

    myScanner4.writeToFile();
    System.out.println();
    myScanner4.readFromFileAndReplace();
  }

  public void writeToFile() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите фразу: ");
    String phrase = scanner.nextLine();
    scanner.close();
    try {
      BufferedWriter fileWriter = new BufferedWriter(new FileWriter("output.txt"));
      fileWriter.write("Hello, I just got '" + phrase + "' from you!\n");
      fileWriter.write("Hello, I just got " + Copter.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Plane.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Rocket.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Car.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Moped.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Motorbike.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Can.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Mug.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Bottle.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Chamomile.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Rose.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Maylily.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Beetle.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Fly.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Mosquito.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Crocodile.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Pigeon.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Raven.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Carrot.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Radish.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Potato.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Diesel.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Petrol.class.getSimpleName() + " from you!\n");
      fileWriter.write("Hello, I just got " + Water.class.getSimpleName() + " from you!\n");
      System.out.println("\n");
      fileWriter.close();
      System.out.println("Фраза успешно записана в файл.");
    } catch (IOException e) {
      System.out.println("Ошибка при записи в файл: " + e.getMessage());
    }
  }

  // Нестатический метод для чтения текста из файла
  //public void readFromFile() {
  //  try {
  //    BufferedReader fileReader = new BufferedReader(new FileReader("output.txt"));
  //    String line = fileReader.readLine();
  //    while (line != null) {
  //      System.out.println("fileReader: " + line);
  //      line = fileReader.readLine();
  //    }
  //    fileReader.close();
  //  } catch (IOException e) {
  //    System.out.println("Ошибка при чтении из файла: " + e.getMessage());
  //  }
  //}
  public void readFromFileAndReplace() {
    try {
      // Читаем файл
      BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

      StringBuilder content = new StringBuilder();
      String line = reader.readLine();

      while (line != null) {
        // Заменяем гласные буквы на пустую строку
        String replacedLine = line.replaceAll("[^aeiouyAEIOUY]", "");
        content.append(replacedLine).append("\n");
        line = reader.readLine();
      }
      reader.close();

      // Записываем измененный текст обратно в файл

      BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
      writer.write(content.toString());
      writer.close();
      System.out.println("Согласные буквы были удалены из файла.");
    } catch (IOException e) {
      System.out.println("Ошибка при чтении или записи в файл: " + e.getMessage());
    }
  }
}
