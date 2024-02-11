package project.bubbles;

public abstract class Water {
  float temp;
  String color;
  String smell;
  String transparency;

  public void main(String color, String transparency, String smell, float temp) {
    this.temp = temp;
    this.color = color;
    this.smell = smell;
    this.transparency = transparency;
  }

  public float getTemp() {
    return temp;
  }

  public String getColor() {
    return color;
  }

  public String getSmell() {
    return smell;
  }

  public String getTransparency() {
    return transparency;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setTransparency(String transparency) {
    this.transparency = transparency;
  }

  public void setSmell(String smell) {
    this.smell = smell;
  }

  public void setTemp(float temp) {
    this.temp = temp;
  }
}
