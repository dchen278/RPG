public class Swordsman extends Protagonist {
  public Swordsman() {
    _hitPts = 200;
    _strength = 50;
    _defense = 65;
    _attack = .4;
  }
  public Swordsman(String name) {
      this();
      _name = name;
  }
}
