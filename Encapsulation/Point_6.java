// Encapsulation: Defining a Class having Method with Parameter

package Encapsulation;

class Point_3{
    int x,y;
    void myPoint(int a,int b){
        x=a;
        y=b;
    }
}
public class Point_6 {
    public static void main(String[] args){
        Point_3 p = new Point_3();
        p.myPoint(10,20);

        System.out.println("X = " + p.x + ", Y = " + p.y);
    }
}
