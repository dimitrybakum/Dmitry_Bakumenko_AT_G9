package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Matter;

public abstract class Aircraft extends Matter {

    protected String name;

    public Aircraft(int mass, String name) {
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
