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

public class MyScanner3 {
  // - читает текст из файла,
  // убирает из него все гласные и записывает новый текст в тот же файл, затирая оригинал.

  public void main(String[] args) {
    // Создаем объект класса Main
    MyScanner3 myScanner3 = new MyScanner3();

    // Вызываем нестатический метод для записи фразы в файл
    myScanner3.readFromFile();
    myScanner3.readFromFileAndReplace();
  }

  // Нестатический метод для чтения текста из файла
  public void readFromFile() {
    try {
      BufferedReader fileReader = new BufferedReader(new FileReader("output.txt"));
      String line = fileReader.readLine();
      while (line != null) {
        System.out.println("fileReader: " + line);
        line = fileReader.readLine();
      }
      fileReader.close();
    } catch (IOException e) {
      System.out.println("Ошибка при чтении из файла: " + e.getMessage());
    }
  }
  public void readFromFileAndReplace() {
    try {
      // Читаем файл
      BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

      StringBuilder content = new StringBuilder();
      String line = reader.readLine();
      while (line != null) {
        // Заменяем гласные буквы на пустую строку
        String replacedLine = line.replaceAll("[aeiouyAEIOUY]", "");
        content.append(replacedLine).append("\n");
        line = reader.readLine();
      }
      reader.close();

      // Записываем измененный текст обратно в файл
      BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
      writer.write(content.toString());
      writer.close();
      System.out.println("Гласные буквы были удалены из файла.");
    } catch (IOException e) {
      System.out.println("Ошибка при чтении или записи в файл: " + e.getMessage());
    }
  }
}
