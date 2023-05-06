import java.util.Arrays;

public class Map {
    private int width;
    private int height;

    private static int quantity=0;


    public  Map(int w, int h)
    {
            width = w;
            height = h;
            quantity++;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static int getQuantity() {
        return quantity;
    }
    public boolean belongsToMap(int[] punkt)
    {
        boolean belongs = false;
        int w = getWidth();
        int h = getHeight();
        for(int x=0; x<w+1;x++)
        {
            for(int y=0;y<h+1;y++)
            {
                int[] punkt1 = {x,y};
                if(Arrays.equals(punkt,punkt1))
                {
                    belongs = true;
                }

            }
        }
        return belongs;
    }
    public void changeOccupation(int[] x,State A, State B)//z A do B
    {
        if(belongsToMap(x)==true)
        {
            A.lose(x);
            B.annex(x);
        }


    }
    public boolean neighbourS(int[]x, State A)
    {
        boolean neighbour = false;
        int[] case1={0,0};
        case1[0]=x[0];
        case1[1]=x[1]+1;
        int[] case2={0,0};
        case2[0]=x[0];
        case2[1]=x[1]-1;
        int[] case3={0,0};
        case3[0]=x[0]+1;
        case3[1]=x[1];
        int[] case4={0,0};
        case3[0]=x[0]-1;
        case3[1]=x[1];



        for(int[] element: A.getArea())
        {


            if(Arrays.equals(case1,element)||Arrays.equals(case2,element)||Arrays.equals(case3,element)||Arrays.equals(case4,element))
            {
                neighbour=true;
                break;
            }

        }
        return neighbour;
    }
    public void Attack(int[] x, State A, State B) // A atakuje B
    {
        if(neighbour(x,A)) {
            int a = A.getGold();
            int b = B.getGold();

            if (a > b) {
                changeOccupation(x, B, A);
            }
        }
    }
}
