package project.bubbles.water;

public abstract class Water {
  private int temperature = 0;
  private String color = "no";
  private String smell = "no";
  private String transparency = "transparent";

  public Water(int temperature, String color, String smell, String transparency) {
    this.temperature = temperature;
    this.color = color;
    this.smell = smell;
    this.transparency = transparency;
  }

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    System.out.printf("temperature were set to: %s ", temperature).println();
    this.temperature = temperature;
  }

  public String getColor() {
    System.out.printf("color is: %s ", color).println();
    return color;
  }

  public void setColor(String color) {
    System.out.printf("new color is: %s ", color).println();
    this.color = color;
  }

  public String getSmell() {
    System.out.printf("smells like: %s ", smell).println();
    return smell;
  }

  public void setSmell(String smell) {
    System.out.printf("new smell like: %s ", smell).println();
    this.smell = smell;
  }

  public String getTransparency() {
    System.out.printf("transparency is: %s ", transparency).println();
    return transparency;
  }

  public void setTransparency(String transparency) {
    System.out.printf("new transparency is: %s ", transparency).println();
    this.transparency = transparency;
  }
}
