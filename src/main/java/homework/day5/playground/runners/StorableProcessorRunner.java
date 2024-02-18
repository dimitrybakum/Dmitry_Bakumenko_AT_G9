package homework.day5.playground.runners;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.hand.Container;
import homework.day5.playground.essence.craft.hand.Storable;
import homework.day5.playground.essence.craft.hand.types.Bottle;
import homework.day5.playground.essence.craft.hand.types.Can;
import homework.day5.playground.essence.material.Pourable;
import homework.day5.playground.essence.material.Powerable;
import homework.day5.playground.essence.material.types.Diesel;
import homework.day5.playground.essence.material.types.Petrol;
import homework.day5.playground.essence.material.types.Water;
import homework.day5.playground.processors.StorableProcessor;

public class StorableProcessorRunner {
  public static void main(String[] args) {

    StorableProcessor storableProcessor = new StorableProcessor();

    Bottle bottle = new Bottle(23, "Glass");
    Storable storableBottle = new Bottle(4, "Plastic");
    Container containerBottle = new Bottle(78, "Metal");
    Matter matterBottle = new Bottle(33, "Blue");
    Can can = new Can(23, "Wooden");
    Storable storableCan = new Can(82, "Small");
    Container containerCan = new Can(54, "Big");
    Matter matterCan = new Can(8, "Old");

    Petrol petrol = new Petrol(11);
    Pourable pourablePetrol = new Petrol(65);
    Pourable pourableDiesel = new Diesel(3);
    Powerable powerableDiesel = new Diesel(87);
    Matter matterPetrol = new Petrol(2);
    Water water = new Water(34);
    Pourable pourableWater = new Water(37);

    storableProcessor.runStorable(bottle, petrol);
    storableProcessor.runStorable(storableBottle, pourablePetrol);
    storableProcessor.runStorable(containerBottle, pourableDiesel);
    storableProcessor.runStorable((Storable) matterBottle, (Pourable) powerableDiesel);
    storableProcessor.runStorable(can, (Pourable) matterPetrol);
    storableProcessor.runStorable(storableCan, water);
    storableProcessor.runStorable(containerCan, pourableWater);
    storableProcessor.runStorable((Storable) matterCan, pourableWater);
  }
}
