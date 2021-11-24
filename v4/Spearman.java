public class Spearman extends Protagonist {
  public Spearman() {
    super();
    _hitPts = 150;
    _strength = 120;
    _defense = 40;
    _attack = .4;
  }

  public Spearman(String name) {
    this();
    _name = name;
  }

  public void specialize() {
    _attack = .6;
    _defense = 20;
  }

  public void normalize() {
    _attack = .4;
    _defense = 40;
  }

  public static String about() {
    return "The spearman is a melee class yond deals a lot of damageth";
  }

}
