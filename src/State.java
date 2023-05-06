import java.util.*;

public class State {
    private Set<int[]> area = new HashSet<>();



    private int gold;
    private int food;
    private int materials;
    private  int ID;

    private static int quantity=0;

    public State(int[] a, int g, int f, int m)
    {
        area.add(a);
        gold = g;
        food = f;
        materials = m;
        ID=quantity+1;
        quantity++;
    }

    public Set<int[]> getArea() {
        return area;
    }

    public int getGold() {
        return gold;
    }

    public int getFood() {
        return food;
    }

    public int getMaterials() {
        return materials;
    }

    public int getID() {
        return ID;
    }

    public static int getQuantity() {
        return quantity;
    }

    public void annex( int[] a)
    {
        area.add(a);
    }
    public void lose(int[] a)
    {
        int[] usun = null;
        for(int[] e: area)
        {
            if(Arrays.equals(a,e))
            {
                usun=e;
                break;
            }

        }
        area.remove(usun);
    }
    public void addGold(int a)
    {
        gold=gold+a;
    }
    public void addFood(int a)
    {
        food=food+a;
    }
}
