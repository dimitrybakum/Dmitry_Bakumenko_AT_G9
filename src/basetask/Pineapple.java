package basetask;

import static java.lang.StringTemplate.STR;

public class Pineapple {
  public String grade;
  public double heatCapacity;
  final int MAX_HEAT_CAPACITY = 2140;

  public void pineappleConstructor(String gradeValue, double heatCapacityValue) {
    this.grade = setGrade(gradeValue);
    this.heatCapacity = setHeatCapacity(heatCapacityValue);
  }

  public void printPineappleDetails() {
    if (getHeatCapacity() > MAX_HEAT_CAPACITY) {
      System.out.println(
              STR."Я ананас  \{this.getGrade()}, теплоемкость \{getHeatCapacity()} которого больше, чем у ветчины");
    } else {
      System.out.println("В ветчине тепла запасется больше :(");
    }
  }

  public double getHeatCapacity() {
    return heatCapacity;
  }

  public double setHeatCapacity(double heatCapacityValue) {
    return heatCapacity = heatCapacityValue;
  }

  public String getGrade() {
    return grade;
  }

  public String setGrade(String gradeValue) {
    return grade = gradeValue;
  }
}
