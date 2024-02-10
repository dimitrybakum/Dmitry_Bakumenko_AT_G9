package basetask;

public class TrainMethodsObjectsRunner {

  public static void main(String[] args) {
    TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

    trainMethodsObjects.processMouse(new Mouse());
    System.out.println();

    trainMethodsObjects.processBee(new Bee());
    System.out.println();

    trainMethodsObjects.processObstacle(new Obstacle());
    System.out.println();

    trainMethodsObjects.processPineapple(new Pineapple());
    System.out.println();

    trainMethodsObjects.processSouce(new Souce());
    System.out.println();
  }
}
