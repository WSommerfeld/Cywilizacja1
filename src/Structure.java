import java.util.Set;

public abstract class Structure {
    private Set<int[]> area;
    private int state;

    public Structure(int[] a, int id)
    {
        area.add(a);
        state = id;
    }

}
