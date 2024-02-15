package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Matter;

public abstract class Vehicle extends Matter {
    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
