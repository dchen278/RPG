public class Ghoul extends Monster {
    public Ghoul() {
        super();
        _hitPts = 125;
        _strength = 50;
        _defense = 60;
        _attack = 1.4;
        _name = "Ghoul";
    }

    public Ghoul(String name) {
        this();
        _name = name;
    }

    public static String about() {
        return "Ghouls art undead creatures yond art hath found in the seweth'rs of the dungeon.  Doth not receiveth closeth to those folk on the teen of potential death.";
    }
    
}
