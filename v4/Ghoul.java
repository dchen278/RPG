public class Ghoul extends Monster {
    public Ghoul() {
        super();
        _hitPts = 125;
        _strength = (int)(Math.random() * 45) + 20;
        _defense = 40;
        _attack = .4;
        _name = "Ghoul";
    }

    public Ghoul(String name) {
        this();
        _name = name;
    }

    public static String about() {
        return "Ghouls are undead creatures that are found in the sewers of the dungeon. ";
    }
    
}
