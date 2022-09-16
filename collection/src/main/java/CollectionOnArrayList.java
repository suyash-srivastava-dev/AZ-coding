import java.util.*;
public class CollectionOnArrayList {
    public static void main(String[] args) {
        //Object initialization
//        ArrayList<Integer> al =new ArrayList<>();
        Rectangle r1=new Rectangle();
    }
}

class Rectangle{
    private int length;
    private int width;
     public static void info()
    {
        System.out.println("Static method called");
    }
    Rectangle()
    {
        System.out.println("Rectangle constructor");
        info();
    }
}