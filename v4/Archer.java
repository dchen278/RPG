public class Archer extends Protagonist {
  public Archer() {
    _hitPts = 100;
    _strength = 200;
    _defense = 20;
    _attack = .4;
  }
  public Archer(String name) {
      this();
      _name = name;
  }
  public void specialize() {
      _attack = .9;
      _defense = 10;
  }

}
