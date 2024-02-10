package com.basetask;

public class Mouse {
  String name;
  int age;

  public void mouseConstructor(String nameValue, int ageValue) {
    this.name = nameValue;
    this.age = ageValue;
  }

  public String getName() {
    return this.name;
  }

  public String setName(String nameValue) {
    return name = nameValue;
  }

  public int getAge() {
    return this.age;
  }

  public int setAge(int ageValue) {
    return age = ageValue;
  }

  public void printMouseDetails() {
    System.out.println("Я мышь, меня зовут " + this.getName() + " и мне " + this.getAge() + " лет");
  }
}
