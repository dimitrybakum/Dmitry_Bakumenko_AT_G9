package homework.day6;

import homework.day5.playground.essence.craft.air.types.Copter;
import homework.day5.playground.essence.craft.air.types.Plane;
import homework.day5.playground.essence.craft.air.types.Rocket;
import homework.day5.playground.essence.craft.field.types.Car;
import homework.day5.playground.essence.craft.field.types.Moped;
import homework.day5.playground.essence.craft.field.types.Motorbike;
import homework.day5.playground.essence.craft.hand.types.Can;
import homework.day5.playground.essence.craft.hand.types.Mug;
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

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args){
        GenericMethodsInGenericClassTwoParams <String, String> genericMethodsInGenericClassTwoParamsSS = new GenericMethodsInGenericClassTwoParams();
        System.out.println(genericMethodsInGenericClassTwoParamsSS.genericMethodGenArgs("this is a string"));
        System.out.println(genericMethodsInGenericClassTwoParamsSS.genericMethodGenArgs("this is a string", "this is another string"));

        GenericMethodsInGenericClassTwoParams<String, Integer> genericMethodsInGenericClassTwoParamsSI = new GenericMethodsInGenericClassTwoParams();
        System.out.println(genericMethodsInGenericClassTwoParamsSI.genericMethodGenArgs("this is a string", 55));

        GenericMethodsInGenericClassTwoParams<String, Double> genericMethodsInGenericClassTwoParamsSD = new GenericMethodsInGenericClassTwoParams();
        System.out.println(genericMethodsInGenericClassTwoParamsSD.genericMethodGenArgs("this is a string", 0.5));

        GenericMethodsInGenericClassTwoParams<Integer, Integer> genericMethodsInGenericClassTwoParamsII = new GenericMethodsInGenericClassTwoParams();
        System.out.println(genericMethodsInGenericClassTwoParamsII.genericMethodGenArgs(5, 8));

        GenericMethodsInGenericClassTwoParams<Copter, Plane> my_Copter_Plane = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(my_Copter_Plane.genericMethodGenArgs(new Copter(55, "Apache")));
        System.out.println(my_Copter_Plane.genericMethodGenArgs(new Copter(55, "Apache"), new Plane(155, "Airbus")));
        my_Copter_Plane.genericMethodHalfGenArgs(new Copter(55, "Apache"), "this is a string");
        my_Copter_Plane.genericMethodHalfGenArgs(new Copter(55, "Apache"), new Plane(155, "Airbus"), "this is a string");

        GenericMethodsInGenericClassTwoParams<Rocket, Car> my_Rocket_Car = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(my_Rocket_Car.genericMethodGenArgs(new Rocket(100, "Sarmat")));
        System.out.println(my_Rocket_Car.genericMethodGenArgs(new Rocket(100, "Sarmat"), new Car(1300, "Mazda")));
        my_Rocket_Car.genericMethodHalfGenArgs(new Rocket(100, "Sarmat"), "this is a string");
        my_Rocket_Car.genericMethodHalfGenArgs(new Rocket(100, "Sarmat"), new Car(1300, "Mazda"), "this is a string");

        GenericMethodsInGenericClassTwoParams<Moped, Motorbike> my_Moped_Motorbike = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(my_Moped_Motorbike.genericMethodGenArgs(new Moped(134, "Java")));
        System.out.println(my_Moped_Motorbike.genericMethodGenArgs(new Moped(134, "Java"), new Motorbike(457, "Honda")));
        my_Moped_Motorbike.genericMethodHalfGenArgs(new Moped(134, "Java"), "this is a string");
        my_Moped_Motorbike.genericMethodHalfGenArgs(new Moped(134, "Java"), new Motorbike(457, "Honda"), "this is a string");

        GenericMethodsInGenericClassTwoParams<Bottle, Can> my_Bottle_Can = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(my_Bottle_Can.genericMethodGenArgs(new Bottle(0.5)));
        System.out.println(my_Bottle_Can.genericMethodGenArgs(new Bottle(0.5), new Can(200, "my_Can")));
        my_Bottle_Can.genericMethodHalfGenArgs(new Bottle(0.5), "this is a string");
        my_Bottle_Can.genericMethodHalfGenArgs(new Bottle(0.5), new Can(200, "my_Can"), "this is a string");

        GenericMethodsInGenericClassTwoParams<Mug, Chamomile> my_Mug_Chamomile = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(my_Mug_Chamomile.genericMethodGenArgs(new Mug(250, "my_Mug")));
        System.out.println(my_Mug_Chamomile.genericMethodGenArgs(new Mug(250, "my_Mug"), new Chamomile(5, "my_Chamomile")));
        my_Mug_Chamomile.genericMethodHalfGenArgs(new Mug(250, "my_Mug"), "this is a string");
        my_Mug_Chamomile.genericMethodHalfGenArgs(new Mug(250, "my_Mug"), new Chamomile(5, "my_Chamomile"), "this is a string");

        GenericMethodsInGenericClassTwoParams<Maylily, Rose> my_Maylily_Rose = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(my_Maylily_Rose.genericMethodGenArgs(new Maylily(5, "my_Maylily")));
        System.out.println(my_Maylily_Rose.genericMethodGenArgs(new Maylily(5, "my_Maylily"), new Rose(5, "my_Rose")));
        my_Maylily_Rose.genericMethodHalfGenArgs(new Maylily(5, "my_Maylily"), "this is a string");
        my_Maylily_Rose.genericMethodHalfGenArgs(new Maylily(5, "my_Maylily"), new Rose(5, "my_Rose"), "this is a string");

        GenericMethodsInGenericClassTwoParams<Beetle, Fly> my_Beetle_Fly = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(my_Beetle_Fly.genericMethodGenArgs(new Beetle(5, "my_Beetle")));
        System.out.println(my_Beetle_Fly.genericMethodGenArgs(new Beetle(5, "my_Beetle"), new Fly(5, "my_Fly")));
        my_Beetle_Fly.genericMethodHalfGenArgs(new Beetle(5, "my_Beetle"), "this is a string");
        my_Beetle_Fly.genericMethodHalfGenArgs(new Beetle(5, "my_Beetle"), new Fly(5, "my_Fly"), "this is a string");

        GenericMethodsInGenericClassTwoParams<Mosquito, Carrot> my_Mosquito_Carrot = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(my_Mosquito_Carrot.genericMethodGenArgs(new Mosquito(5, "my_Mosquito")));
        System.out.println(my_Mosquito_Carrot.genericMethodGenArgs(new Mosquito(5, "my_Mosquito"), new Carrot(5, "my_Carrot")));
        my_Mosquito_Carrot.genericMethodHalfGenArgs(new Mosquito(5, "my_Mosquito"), "this is a string");
        my_Mosquito_Carrot.genericMethodHalfGenArgs(new Mosquito(5, "my_Mosquito"), new Carrot(5, "my_Carrot"), "this is a string");

        GenericMethodsInGenericClassTwoParams<Potato, Radish> my_Potato_Radish = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(my_Potato_Radish.genericMethodGenArgs(new Potato(5, "my_Potato")));
        System.out.println(my_Potato_Radish.genericMethodGenArgs(new Potato(5, "my_Potato"), new Radish(5, "my_Radish")));
        my_Potato_Radish.genericMethodHalfGenArgs(new Potato(5, "my_Potato"), "this is a string");
        my_Potato_Radish.genericMethodHalfGenArgs(new Potato(5, "my_Potato"), new Radish(5, "my_Radish"), "this is a string");

        GenericMethodsInGenericClassTwoParams<Crocodile, Pigeon> my_Crocodile_Pigeon = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(my_Crocodile_Pigeon.genericMethodGenArgs(new Crocodile(5, "my_Crocodile")));
        System.out.println(my_Crocodile_Pigeon.genericMethodGenArgs(new Crocodile(5, "my_Crocodile"), new Pigeon(5, "my_Pigeon")));
        my_Crocodile_Pigeon.genericMethodHalfGenArgs(new Crocodile(5, "my_Crocodile"), "this is a string");
        my_Crocodile_Pigeon.genericMethodHalfGenArgs(new Crocodile(5, "my_Crocodile"), new Pigeon(5, "my_Pigeon"),"this is a string");

        GenericMethodsInGenericClassTwoParams<Raven, Diesel> my_Raven_Diesel = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(my_Raven_Diesel.genericMethodGenArgs(new Raven(5, "my_Raven")));
        System.out.println(my_Raven_Diesel.genericMethodGenArgs(new Raven(5, "my_Raven"), new Diesel()));
        my_Raven_Diesel.genericMethodHalfGenArgs(new Raven(5, "my_Raven"), "this is a string");
        my_Raven_Diesel.genericMethodHalfGenArgs(new Raven(5, "my_Raven"), new Diesel(), "this is a string");

        GenericMethodsInGenericClassTwoParams<Petrol, Water> my_Petrol_Water = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(my_Petrol_Water.genericMethodGenArgs(new Petrol()));
        System.out.println(my_Petrol_Water.genericMethodGenArgs(new Petrol(), new Water()));
        my_Petrol_Water.genericMethodHalfGenArgs(new Petrol(), "this is a string");
        my_Petrol_Water.genericMethodHalfGenArgs(new Petrol(), new Water(), "this is a string");
  }

}
