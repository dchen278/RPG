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
        return "Goblins are a common enemy of adventurers. They are weak in melee, but can be " +
                "very difficult to kill.";
    }
    
}
