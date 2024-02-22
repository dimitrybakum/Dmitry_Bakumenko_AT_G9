package project.bubbles;

public interface Containable {

  void addStuff(Transformable stuff);

  void removeStuff(Transformable stuff);

  boolean isEmpty();
}
