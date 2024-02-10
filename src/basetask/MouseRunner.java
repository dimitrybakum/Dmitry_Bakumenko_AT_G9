package com.basetask;

public class MouseRunner {
  public static void main(String[] args) {
    Mouse mouse = new Mouse();
    mouse.mouseConstructor("Микки Маус", 29);
    mouse.printMouseDetails();

    Mouse mouse2 = new Mouse();
    mouse2.mouseConstructor("Мини Маус", 27);
    mouse2.printMouseDetails();
  }
}
