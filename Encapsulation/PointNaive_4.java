// A program that uses simple Point Class and Naive initialization of it's data

package Encapsulation;

class Point{
    int x,y;
}
public class PointNaive_4 {
    public static void main(String[] args) {
        Point p = new Point();

        p.x = 5;
        p.y = 10;

        System.out.println("X: "+p.x);
        System.out.println("Y: "+p.y);
    }
}
