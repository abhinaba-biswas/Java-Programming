// A program that declares two objects of the Circle Class

package Encapsulation;

class Circle2 {
    double x,y;
    double r;
    double circumference(){
        return 2*Math.PI*r;
    }
    double area(){
        return Math.PI*r*r;
    }
}

public class CircleDemo_2 {
    public static void main(String[] args){
        Circle2 c1 = new Circle2();
        Circle2 c2 = new Circle2();

        c1.x = 3;
        c1.y = 4;
        c1.r = 5;
        c2.x = 5;
        c2.y = 6;
        c2.r = 7;
        System.out.println("The circumference of Circe 1 is " + c1.circumference());
        System.out.println("The area of Circle 1 is " + c1.area());
        System.out.println("The circumference of Circle 2 is " + c2.circumference());
        System.out.println("The area of Circle 2 is " + c2.area());

    }
}
