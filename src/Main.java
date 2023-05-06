import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map map = new Map(2,2);

        System.out.print("width"+map.getWidth());
        System.out.print(" height"+map.getHeight());
        System.out.println(" quantity"+map.getQuantity());

        State Wrocław = new State(new int[]{1, 1},200,100,100);

    if(Wrocław.getArea()!=null)
    {
        Set<int[]> q1 = new HashSet<>();
        q1.addAll(Wrocław.getArea());
        for (int[] a : q1) {
            int[] bufor = a;
            int b = bufor[0];
            int c = bufor[1];
            System.out.print("wropunkt"+b);
            System.out.println(c);

        }
        q1.clear();
    }
        System.out.print("wroID"+Wrocław.getID());
        System.out.println(" quantity"+Wrocław.getQuantity());

        State Warszawa = new State(new int[]{1, 2},100,100,100);

        if(Warszawa.getArea()!=null)
        {
            Set<int[]> q1 = new HashSet<>();
            q1.addAll(Warszawa.getArea());
            for (int[] a : q1) {
                int[] bufor = a;
                int b = bufor[0];
                int c = bufor[1];
                System.out.print("wwapunkt"+b);
                System.out.println(c);

            }
            q1.clear();
        }
        System.out.print("wwaID"+Warszawa.getID());
        System.out.println("quantity"+Warszawa.getQuantity());


       map.Attack(new int[]{1,2},Wrocław,Warszawa);


        if(Wrocław.getArea()!=null)
        {
            Set<int[]> q1 = new HashSet<>();
            q1.addAll(Wrocław.getArea());
            for (int[] a : q1) {
                int[] bufor = a;
                int b = bufor[0];
                int c = bufor[1];
                System.out.print("wropunkt"+b);
                System.out.println(c);

            }
            q1.clear();
        }
        System.out.print("wroID"+Wrocław.getID());
        System.out.println(" quantity"+Wrocław.getQuantity());

        if(Warszawa.getArea()!=null)
        {
            Set<int[]> q1 = new HashSet<>();
            q1.addAll(Warszawa.getArea());
            for (int[] a : q1) {
                int[] bufor = a;
                int[] pyt = {1,2};
                int b = bufor[0];
                int c = bufor[1];
                System.out.print("wwapunkt"+b);
                System.out.println(c);


            }
            q1.clear();
        }
        System.out.print("wwaID"+Warszawa.getID());
        System.out.println("quantity"+Warszawa.getQuantity());




    System.out.println(map.belongsToMap(new int[]{1,1}));
    System.out.println(map.neighbourS(new int[]{1,1},Wrocław));







    }
}