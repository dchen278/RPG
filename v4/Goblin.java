public class Goblin extends Monster {
    public Goblin() {
        _attack = .4;
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
