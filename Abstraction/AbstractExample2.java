package Abstraction;

abstract class Shape{

    public Shape(){
        System.out.println("We will study the following shapes");
    }
    abstract public  double perimeter();
    abstract public double area();
}

class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        System.out.println("Circle");
        this.radius=radius;
    }
    public double perimeter(){
        return (2*Math.PI*this.radius);
    }

    public double area(){
        return (Math.PI*this.radius*this.radius);
    }
}
class Rectangle extends Shape{
    private double length;
    private double breadth;
    public Rectangle(double length,double breadth){
        System.out.println("Rectangle is");
        this.length=length;
        this.breadth=breadth;
    }

    public double perimeter(){
        return 2*(this.length+this.breadth);
    }
    public double area(){
        return (this.length*this.breadth);
    }
}
public class AbstractExample2 {

    public static void main(String[] args) {
        Shape s=new Rectangle(55,10);
        System.out.println(s.perimeter());
        System.out.println(s.area());

        Shape c=new Circle(10);
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}
