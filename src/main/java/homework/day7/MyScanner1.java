package homework.day7;

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

public class MyScanner1 {
  // - выводит в консоль фразу "Hello, I just got 'X' from you!", где Х - фраза, вводимая в консоль
  // с клавиатуры.
  public static void main(String[] args) {
    MyScanner1 myScanner1 = new MyScanner1();
    myScanner1.printPhrase();
  }

    public void printPhrase() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите фразу: ");
    String phrase = scanner.nextLine();
    System.out.printf("Hello, I just got '%s' from you!", phrase).println();
    System.out.printf("Hello, I just got '%s' from you!", Copter.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Plane.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Rocket.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Car.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Moped.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Motorbike.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Can.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Mug.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Bottle.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Chamomile.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Rose.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Maylily.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Beetle.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Fly.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Mosquito.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Crocodile.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Pigeon.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Raven.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Carrot.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Radish.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Potato.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Diesel.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Petrol.class.getSimpleName()).println();
    System.out.printf("Hello, I just got '%s' from you!", Water.class.getSimpleName()).println();
    scanner.close();
  }

}
