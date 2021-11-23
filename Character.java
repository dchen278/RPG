public class Character {
    private int _hitPts;
    private int _strength;
    private int _defense;
    private double _attack;


    public Boolean isAlive() {
        return _hitPts <= 0;
    }

    public int getDefense() {
        return _defense;
    }

    public void lowerHP(int amount) {
        _hitPts -= amount;
    }

    public int attack(Character c) {
        int damage = (int)( (_strength * _attack) - c.getDefense() );
            
        if ( damage < 0 ) {
          damage = 0;
        }
    
        c.lowerHP(damage);
        return damage;
    }
}