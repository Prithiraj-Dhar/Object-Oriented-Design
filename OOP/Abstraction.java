// abstract class
abstract class Shape{
    protected String color;

    // constructor
    public Shape(String color){
        this.color = color;
    }

    // abstract method
    public abstract double area();

    // concrete method
    public void displayColor(){
        System.out.println("This shape is "+color);
    }
}

// interface
interface Drawable{
    void draw();
}

// concrete class implementing shape and drawable
class Circle extends Shape implements Drawable{
    private double radius;

    public Circle(String color,double radius){
        super(color); // call shape constructor
        this.radius = radius;
    }

    // implementing abstract method from shape
    @Override
    public double area(){
        return 3.1416*radius*radius;
    }

    // implementing method from drawable interface
    @Override
    public void draw(){
        System.out.println("Drawing a circle.");
    }
}

// main class

public class Abstraction{
    public static void main(String[] args) {
        Circle circle = new Circle("Red",5);

        circle.displayColor();
        circle.draw();

        System.out.println("Area: "+circle.area());
    }
}