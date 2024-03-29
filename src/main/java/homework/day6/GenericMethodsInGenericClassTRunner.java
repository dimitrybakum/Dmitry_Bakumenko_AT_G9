package homework.day6;

import homework.day5.playground.essence.craft.air.types.Copter;
import homework.day5.playground.essence.craft.air.types.Plane;
import homework.day5.playground.essence.craft.air.types.Rocket;
import homework.day5.playground.essence.craft.field.types.Car;
import homework.day5.playground.essence.craft.field.types.Moped;
import homework.day5.playground.essence.craft.field.types.Motorbike;
import homework.day5.playground.essence.craft.hand.types.Can;
import homework.day5.playground.essence.craft.hand.types.Mug;
import homework.day5.playground.essence.creatures.Crawlable;
import homework.day5.playground.essence.creatures.flowers.types.Chamomile;
import homework.day5.playground.essence.creatures.flowers.types.Maylily;
import homework.day5.playground.essence.creatures.flowers.types.Rose;
import homework.day5.playground.essence.creatures.insects.types.Beetle;
import homework.day5.playground.essence.creatures.insects.types.Fly;
import homework.day5.playground.essence.creatures.insects.types.Mosquito;
import homework.day5.playground.essence.creatures.vegetable.type.Carrot;
import homework.day5.playground.essence.creatures.vegetable.type.Potato;
import homework.day5.playground.essence.creatures.vegetable.type.Radish;
import homework.day5.playground.essence.creatures.vertebratas.types.Crocodile;
import homework.day5.playground.essence.creatures.vertebratas.types.Pigeon;
import homework.day5.playground.essence.creatures.vertebratas.types.Raven;
import homework.day5.playground.essence.material.types.Diesel;
import homework.day5.playground.essence.material.types.Petrol;
import homework.day5.playground.essence.material.types.Water;
import project.bubbles.boxing.Bottle;

public class GenericMethodsInGenericClassTRunner {
  public static void main(String[] args) {
    GenericMethodsInGenericClassT<String> my_String = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Integer> my_Integer = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Double> my_Double = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Copter> my_Copter = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Plane> my_Plane = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Rocket> my_Rocket = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Car> my_Car = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Moped> my_Moped = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Motorbike> my_Motorbike = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Bottle> my_Bottle = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Can> my_Can = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Mug> my_Mug = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Chamomile> my_Chamomile = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Maylily> my_Maylily = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Rose> my_Rose = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Beetle> my_Beetle = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Fly> my_Fly = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Mosquito> my_Mosquito = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Carrot> my_Carrot = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Potato> my_Potato = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Radish> my_Radish = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Crocodile> my_Crocodile = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Pigeon> my_Pigeon = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Raven> my_Raven = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Crawlable> my_Crawlable = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Diesel> my_Diesel = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Petrol> my_Petrol = new GenericMethodsInGenericClassT<>();
    GenericMethodsInGenericClassT<Water> my_Water = new GenericMethodsInGenericClassT<>();

    my_String.genericMethodOneGenArg("this is a string");
    my_Integer.genericMethodOneGenArg(5);
    my_Double.genericMethodOneGenArg(0.5);
    my_Copter.genericMethodOneGenArg(new Copter(55, "Apache"));
    my_Plane.genericMethodOneGenArg(new Plane(155, "Airbus"));
    my_Rocket.genericMethodOneGenArg(new Rocket(100, "Sarmat"));
    my_Car.genericMethodOneGenArg(new Car(1300, "Mazda"));
    my_Moped.genericMethodOneGenArg(new Moped(134, "Java"));
    my_Motorbike.genericMethodOneGenArg(new Motorbike(457, "Honda"));
    //my_Bottle.genericMethodOneGenArg(new Bottle(0.5));
    my_Can.genericMethodOneGenArg(new Can(200, "my_Can"));
    my_Mug.genericMethodOneGenArg(new Mug(250, "my_Mug"));
    my_Chamomile.genericMethodOneGenArg(new Chamomile(5, "my_Chamomile"));
    my_Maylily.genericMethodOneGenArg(new Maylily(5, "my_Maylily"));
    my_Rose.genericMethodOneGenArg(new Rose(5, "my_Rose"));
    my_Beetle.genericMethodOneGenArg(new Beetle(5, "my_Beetle"));
    my_Fly.genericMethodOneGenArg(new Fly(5, "my_Fly"));
    my_Mosquito.genericMethodOneGenArg(new Mosquito(5, "my_Mosquito"));
    my_Carrot.genericMethodOneGenArg(new Carrot(5, "my_Carrot"));
    my_Potato.genericMethodOneGenArg(new Potato(5, "my_Potato"));
    my_Radish.genericMethodOneGenArg(new Radish(5, "my_Radish"));
    my_Crocodile.genericMethodOneGenArg(new Crocodile(5, "my_Crocodile"));
    my_Pigeon.genericMethodOneGenArg(new Pigeon(5, "my_Pigeon"));
    my_Raven.genericMethodOneGenArg(new Raven(5, "my_Raven"));
    my_Crawlable.genericMethodOneGenArg(new Crocodile(1000, "Gena"));
    my_Diesel.genericMethodOneGenArg(new Diesel(4));
    my_Petrol.genericMethodOneGenArg(new Petrol(4));
    my_Water.genericMethodOneGenArg(new Water(5));

    System.out.println(my_String.genericMethodTwoGenArgs("string1", "string2"));
    System.out.println(my_Integer.genericMethodTwoGenArgs(5, 6));
    System.out.println(my_Double.genericMethodTwoGenArgs(0.5, 0.5));
    System.out.println(my_Copter.genericMethodTwoGenArgs(new Copter(55, "Apache"), new Plane(155, "Airbus")));
    System.out.println(my_Plane.genericMethodTwoGenArgs(new Plane(155, "Airbus"), new Moped(55, "Suzuki")));
    System.out.println(my_Rocket.genericMethodTwoGenArgs(new Rocket(100, "Sarmat"), new Pigeon(5, "my_Pigeon")));
    System.out.println(my_Car.genericMethodTwoGenArgs(new Car(1300, "Mazda"), new Rose(5, "my_Rose")));
    System.out.println(my_Moped.genericMethodTwoGenArgs(new Moped(134, "Java"), new Radish(5, "my_Radish")));
    System.out.println(my_Motorbike.genericMethodTwoGenArgs(new Motorbike(457, "Honda"), new Diesel(5)));
    //System.out.println(my_Bottle.genericMethodTwoGenArgs(new Bottle(0.5), new Maylily(5, "my_Maylily")));
    System.out.println(my_Can.genericMethodTwoGenArgs(new Can(200, "my_Can"), new Petrol(33)));
    System.out.println(my_Mug.genericMethodTwoGenArgs(new Mug(250, "my_Mug"), new Potato(5, "my_Potato")));
    System.out.println(my_Chamomile.genericMethodTwoGenArgs(new Chamomile(5, "my_Chamomile"), new Beetle(5, "my_Beetle")));
    System.out.println(my_Maylily.genericMethodTwoGenArgs(new Maylily(5, "my_Maylily"), new Water(5)));
    System.out.println(my_Rose.genericMethodTwoGenArgs(new Rose(5, "my_Rose"), new Fly(5, "my_Fly")));
    System.out.println(my_Beetle.genericMethodTwoGenArgs(new Beetle(5, "my_Beetle"), new Radish(5, "my_Radish")));
    System.out.println(my_Fly.genericMethodTwoGenArgs(new Fly(5, "my_Fly"), new Crocodile(5, "my_Crocodile")));
    System.out.println(my_Mosquito.genericMethodTwoGenArgs(new Mosquito(5, "my_Mosquito"), new Rocket(100, "Sarmat")));
    System.out.println(my_Carrot.genericMethodTwoGenArgs(new Carrot(5, "my_Carrot"), new Moped(134, "Java")));
    System.out.println(my_Potato.genericMethodTwoGenArgs(new Potato(5, "my_Potato"), new Can(200, "my_Can")));
    System.out.println(my_Radish.genericMethodTwoGenArgs(new Radish(5, "my_Radish"), new Carrot(5, "my_Carrot")));
    System.out.println(my_Crocodile.genericMethodTwoGenArgs(new Crocodile(5, "my_Crocodile"), new Motorbike(457, "Honda")));
    System.out.println(my_Pigeon.genericMethodTwoGenArgs(new Pigeon(5, "my_Pigeon"), new Plane(155, "Airbus")));
    System.out.println(my_Raven.genericMethodTwoGenArgs(new Raven(5, "my_Raven"), new Moped(55, "Suzuki")));
    System.out.println(my_Crawlable.genericMethodTwoGenArgs(new Crocodile(5, "my_Crocodile"), new Diesel(8)));
    System.out.println(my_Diesel.genericMethodTwoGenArgs(new Diesel(6), new Potato(5, "my_Potato")));
    System.out.println(my_Petrol.genericMethodTwoGenArgs(new Petrol(5), new Fly(5, "my_Fly")));
    System.out.println(my_Water.genericMethodTwoGenArgs(new Water(5), new Chamomile(5, "my_Chamomile")));

    my_String.genericMethodHalfGenArgs("this is a string", "this is another string");
    my_Integer.genericMethodHalfGenArgs(5, "this is a string");
    my_Double.genericMethodHalfGenArgs(0.5, "this is a string");
    my_Copter.genericMethodHalfGenArgs(new Copter(55, "Apache"), "this is a string");
    my_Plane.genericMethodHalfGenArgs(new Plane(155, "Airbus"), "this is a string");
    my_Rocket.genericMethodHalfGenArgs(new Rocket(100, "Sarmat"), "this is a string");
    my_Car.genericMethodHalfGenArgs(new Car(1300, "Mazda"), "this is a string");
    my_Moped.genericMethodHalfGenArgs(new Moped(134, "Java"), "this is a string");
    my_Motorbike.genericMethodHalfGenArgs(new Motorbike(457, "Honda"), "this is a string");
    //my_Bottle.genericMethodHalfGenArgs(new Bottle(0.5), "this is a string");
    my_Can.genericMethodHalfGenArgs(new Can(200, "my_Can"), "this is a string");
    my_Mug.genericMethodHalfGenArgs(new Mug(250, "my_Mug"), "this is a string");
    my_Chamomile.genericMethodHalfGenArgs(new Chamomile(5, "my_Chamomile"), "this is a string");
    my_Maylily.genericMethodHalfGenArgs(new Maylily(5, "my_Maylily"), "this is a string");
    my_Rose.genericMethodHalfGenArgs(new Rose(5, "my_Rose"), "this is a string");
    my_Beetle.genericMethodHalfGenArgs(new Beetle(5, "my_Beetle"), "this is a string");
    my_Fly.genericMethodHalfGenArgs(new Fly(5, "my_Fly"), "this is a string");
    my_Mosquito.genericMethodHalfGenArgs(new Mosquito(5, "my_Mosquito"), "this is a string");
    my_Carrot.genericMethodHalfGenArgs(new Carrot(5, "my_Carrot"), "this is a string");
    my_Potato.genericMethodHalfGenArgs(new Potato(5, "my_Potato"), "this is a string");
    my_Radish.genericMethodHalfGenArgs(new Radish(5, "my_Radish"), "this is a string");
    my_Crocodile.genericMethodHalfGenArgs(new Crocodile(5, "my_Crocodile"), "this is a string");
    my_Pigeon.genericMethodHalfGenArgs(new Pigeon(5, "my_Pigeon"), "this is a string");
    my_Raven.genericMethodHalfGenArgs(new Raven(5, "my_Raven"), "this is a string");
    my_Crawlable.genericMethodHalfGenArgs(new Beetle(13, "Juice"), "this is a string");
    my_Diesel.genericMethodHalfGenArgs(new Diesel(9), "this is a string");
    my_Petrol.genericMethodHalfGenArgs(new Petrol(23), "this is a string");
    my_Water.genericMethodHalfGenArgs(new Water(2), "this is a string line");
  }
}
