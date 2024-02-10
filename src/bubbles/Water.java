package bubbles;

public abstract class Water {
  String color;
  String transparency;
  String smell;
  float temp;

  public void main(String color, String transparency, String smell, float temp){
    this.color = color;
    this.transparency = transparency;
    this.smell = smell;
    this.temp = temp;
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
}
