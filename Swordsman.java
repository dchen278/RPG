public class Swordsman extends Protagonist {
  public Swordsman() {
    super();
    _hitPts = 200;
    _strength = 100;
    _defense = 65;
    _attack = 0.6;
  }
  public Swordsman(String name) {
      this();
      _name = name;
  }
  
  public void specialize() {
    _attack = 1.4;
    _defense = 40;
  }

  public void normalize() {
    _attack = 0.6;
    _defense = 65;
  }

  public static String about() {
    return "The Swordsman is a good fighter, but not very strong.\n" +
           "He has a high defense, but low strength.\n";
  }
}
