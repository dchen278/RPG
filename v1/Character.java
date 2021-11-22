public class Character {
    private int hp;
    private int strength;
    private int defense;
    private double attackRating;


    public Boolean isAlive() {
        return hp <= 0;
    }

    public int getDefense() {
        return defense;
    }

    public void lowerHP(int amount) {
        hp -= amount;
    }

    public void attack(Character c) {
        int damage = (int) (strength * attackRating) - c.getDefense();
        c.lowerHP(damage);
    }
}