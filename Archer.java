public class Archer extends Protagonist {
  public Archer() {
    super();
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

  public void normalize() {
    _attack = .4;
    _defense = 20;
  }

  public static String about() {
    return "Arch'rs art valorous at rang'd attacks.  Those gents suff'r und'r the blunt of melee weapons";
  }

}
