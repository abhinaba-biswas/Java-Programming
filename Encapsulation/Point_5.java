// Encapsulation: Defining a Class with Method

package Encapsulation;

class Point_1{
    int x,y;
    void setPoint(){
        x = 10;
        y = 20;
    }
}

public class Point_5 {
    public static void main(String[] args){
        Point_1 p = new Point_1();
        p.setPoint();
        System.out.println("The point X is at = "+p.x);
        System.out.println("The point Y is at = "+p.y);
    }
}
