public class Spearman extends Protagonist {
  public Spearman() {
    _hitPts = 150;
    _strength = 120;
    _defense = 40;
    _attack = .4;
  }

  public Spearman(String name) {
    this();
    _name = name;
  }

  public static String about() {
    return "The spearman is a melee class yond deals a lot of damageth";
  }

}
