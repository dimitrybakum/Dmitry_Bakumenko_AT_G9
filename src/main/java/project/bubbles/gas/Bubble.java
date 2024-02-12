package project.bubbles.gas;

public class Bubble {
  private double volume = 0.3;
  private String gas;

  public Bubble(String gas) {
    this.gas = gas;
  }

  public void cramp() {
    System.out.println("Cramp!");
  }

  public double getBubbleVolume() {
    System.out.println("current BubbleVolume is" + volume);
    return volume;
  }
}
