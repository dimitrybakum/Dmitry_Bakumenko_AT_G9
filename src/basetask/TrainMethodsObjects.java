package basetask;

public class TrainMethodsObjects {
  public void processMouse(Mouse mouse) {
    mouse.mouseConstructor("МиккиМаус", 35);
    System.out.println("возраст: " + mouse.getAge() + ", имя мыши: " + mouse.getName());
    mouse.printMouseDetails();
  }

  public void processSouce(Souce souce) {
    souce.souseConstructor("терияки", "коричневого");
    System.out.println(souce.getName() + souce.getColor());
    souce.printSouceDetails();
  }

  public void processBee(Bee bee) {
    bee.beeConstructor("female", 7);
    System.out.println("пол пчелы : " + bee.getGender() + "  вес пчелы : " + bee.getWeight());
    bee.printBeeDetails();
  }

  public void processObstacle(Obstacle obstacle) {
    obstacle.obstacleConstructor("Critical", "500 Internal Server Error");
    System.out.println(obstacle.getSeverity() + ": " + obstacle.getDescription());
    obstacle.printObstacleDetails();
  }

  public void processPineapple(Pineapple pineapple) {
    pineapple.pineappleConstructor("'Маврикий' ", 2343.4);
    System.out.println(
        "сорт :" + pineapple.getGrade() + ", теплоемкость " + pineapple.getHeatCapacity());
    pineapple.printPineappleDetails();
  }
}
