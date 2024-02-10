package com.basetask;

public class Obstacle {
  String description;
  String severity;

  public void obstacleConstructor(String severity, String description) {
    this.description = description;
    this.severity = severity;
  }

  public void printObstacleDetails() {
    System.out.println(
        "Возникло " + this.getSeverity() + " препятствиие: " + this.getDescription());
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {

    this.description = description;
  }

  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }
}
