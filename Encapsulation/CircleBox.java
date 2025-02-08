package Encapsulation;
/**
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
*/
class Box {
    double depth;
    double width;
    double height;

    double area(){
        return ((depth*width)+(width*height)+(height*depth))*2;
    }

    double volume(){
        return depth*width*height;
    }
}
public class CircleBox {
    public static void main(String[] args){
        Circle c = new Circle();
        Box b = new Box();

        c.x = 0;
        c.y = 0;
        c.r = 5;
        b.depth = 2;
        b.width = 2;
        b.height = 5;
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Circumference of Circle: " + c.circumference());
        System.out.println("Volume of Box: " + b.volume());
        System.out.println("Area of Box: " + b.area());
    }
}
