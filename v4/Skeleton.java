public class Skeleton extends Monster {
    public Skeleton() {
        _attack = .4;
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
