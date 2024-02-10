package com.basetask;

public class SoouceRunner {
  public static void main(String[] args) {
    Souce souce = new Souce();
    souce.souseConstructor("кислый", "зеленого");
    souce.printSouceDetails();

    Souce souce2 = new Souce();
    souce2.souseConstructor("острый", "красного");
    souce2.printSouceDetails();
  }
}
