/*
  class Monster -- Represents random incarnations of
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Monster extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private int _hitPts;
    private int _strength;
    private int _defense;
    private double _attack;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /**
     * default constructor pre: instance vars are declared post: initializes
     * instance vars.
     **/
    public Monster() {
        _hitPts = 150;
        _strength = 20 + (int) (Math.random() * 45); // [20,65)
        _defense = 20;
        _attack = 1;
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public int getDefense() {
        return _defense;
    }

    public int getStrength() {
      return _strength;
    }

    public double getAttack() {
      return _attack;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /**
     * void lowerHP(int) -- lowers life by input value pre: Input >= 0 post: Life
     * instance var is lowered by input ammount.
     **/
    public void lowerHP(int damageInflicted) {
        _hitPts = _hitPts - damageInflicted;
    }

}// end class Monster
