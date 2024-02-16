package homework.day5.playground.essence;

public abstract class Matter {
  // -- у материи должно быть protected поле веса, int mass, конструктор, соответствующие геттеры и
  // сеттеры

  protected int mass;

  public Matter(int mass) {
    this.mass = mass;
  }

  public int getMass() {
    return mass;
  }

  public void setMass(int mass) {
    this.mass = mass;
  }
}
