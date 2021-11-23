public class Character {
    protected int _hitPts;
    protected int _strength;
    protected int _defense;
    protected double _attack;


    public Boolean isAlive() {
        return _hitPts > 0;
    }

    public int getDefense() {
        return _defense;
    }

    public int getStrength() {
      return _strength;
    }

    public double getAttack() {
      return _attack;
    }

    public void lowerHP(int amount) {
        _hitPts -= amount;
    }
    
    public int getHealth(){
   	 return _hitPts;
    }

    public int attack(Character c) {
        System.out.println(c.getStrength());
        System.out.println(c.getAttack());
        System.out.println(c.getDefense());
	      System.out.println(c.getHealth());

        int damage = (int)( (c.getStrength() * c.getAttack()) - c.getDefense() );

        if ( damage < 0 ) {
          damage = 0;
        }

        c.lowerHP(damage);
        return damage;
    }
}
