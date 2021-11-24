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
        return "Skeletons are tough and slow, but they are also very weak.";
    }
    
}
