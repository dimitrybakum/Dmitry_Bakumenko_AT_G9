package project.bubbles;

public class Runner {
  public static void main(String[] args) {
    Bottle bottle1 = new Bottle(0.05f);
    Bottle bottle2 = new Bottle(0.1f);
    Bottle bottle3 = new Bottle(0.2f);

    bottle1.open();
    bottle2.open();
    bottle3.open();
  };
}
