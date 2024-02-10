package basetask;

public class Bee {
  String gender;
  long weight;

  public void beeConstructor(String genderValue, long weightValue) {
    this.gender = genderValue;
    this.weight = weightValue;
  }

  public void printBeeDetails() {
    System.out.println("Я легче лося в " + 500000 / getWeight() + " раз");
  }

  public String getGender() {
    return this.gender;
  }

  public String setGender(String genderValue) {
    return gender = genderValue;
  }

  public long getWeight() {
    return this.weight;
  }

  public void setWeight(long weightValue) {
     this.weight = weightValue;
  }
}
