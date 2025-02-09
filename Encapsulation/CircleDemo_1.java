package Encapsulation;

class Circle {
    double x,y;
    double r;
    double circumference(){
        return 2*Math.PI*r;
    }
    double area(){
        return Math.PI*r*r;
    }
}

public class CircleDemo_1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x = 0;
        c.y = 0;
        c.r = 5;
        System.out.println("The circumference of the circle is "+c.circumference());
        System.out.println("The area of the circle is "+c.area());
    }
}
