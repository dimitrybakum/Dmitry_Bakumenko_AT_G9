package com.basetask;

public class Souce {
  String name;
  String color;

  public void souseConstructor(String nameValue, String colorValue) {
    this.name = nameValue;
    this.color = colorValue;
  }

  public String getName() {
    return this.name;
  }

  public String setName(String nameValue) {
    return name = nameValue;
  }

  public String getColor() {
    return this.color;
  }

  public String setColor(String colorValue) {
    return color = colorValue;
  }

  void printSouceDetails() {
    System.out.println("Это соус " + this.getName() + " " + this.getColor() + " цвета");
  }
}
