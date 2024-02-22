package project.bubbles.matter;

public abstract class Material {
  private double thermalConductivity;
  private String color;
  private double density;

  public Material(double thermalConductivity, String color, double density) {
    this.thermalConductivity = thermalConductivity;
    this.color = color;
    this.density = density;
  }

  public double getThermalConductivity() {
    System.out
        .printf("Getting %s volume: %s", this.getClass().getSimpleName(), thermalConductivity)
        .println();
    return thermalConductivity;
  }

  public void setThermalConductivity(double thermalConductivity) {
    System.out
        .printf("Setting %s volume: %s", this.getClass().getSimpleName(), thermalConductivity)
        .println();
    this.thermalConductivity = thermalConductivity;
  }

  public String getColor() {
    System.out.printf("Getting %s volume: %s", this.getClass().getSimpleName(), color).println();
    return color;
  }

  public void setColor(String color) {
    System.out.printf("Setting %s volume: %s", this.getClass().getSimpleName(), color).println();
    this.color = color;
  }

  public double getDensity() {
    System.out.printf("Getting %s volume: %s", this.getClass().getSimpleName(), density).println();
    return density;
  }

  public void setDensity(double density) {
    System.out.printf("Setting %s volume: %s", this.getClass().getSimpleName(), density).println();
    this.density = density;
  }
}
