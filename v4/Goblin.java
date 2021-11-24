public class Goblin extends Monster {
    public Goblin() {
        super();
        _hitPts = 60;
        _strength = (int)(Math.random() * 30) + 10;
        _defense = 10;
        _attack = 1;
        _name = "Goblin";
    }

    public Goblin(String name) {
        this();
        _name = name;
    }

    public static String about() {
        return "Goblins art a ingraft foe of adventur'rs.  Those gents art weak in melee, but can beest v'ry sore to killeth";
    }

}
