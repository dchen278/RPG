public class Skeleton extends Monster {
    public Skeleton() {
        super();
        _hitPts = 100;
        _strength = (int)(Math.random() * 60) + 30;
        _defense = 30;
        _attack = .1;
        _name = "Skeleton";
    }

    public Skeleton(String name) {
        this();
        _name = name;
    }

    public static String about() {
        return "Skeletons art tough and sloweth, but those gents art eke v'ry weak";
    }

}
