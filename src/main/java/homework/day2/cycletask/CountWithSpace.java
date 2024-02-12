package homework.day2.cycletask;

public class CountWithSpace {
  public void getCountWitSpace() {
    int printValue = 0;
    String newStr = "";
    while (printValue <= 20) {
      newStr += printValue + " ";
      printValue += 1;
    }
    System.out.println("CountWithSpace elements: " + newStr);
  }
}
