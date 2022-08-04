/**
 * Implementing Abstraction and Constructor
 */
abstract class Shape{

    abstract int area();
    abstract int perimerter();
}
class Square extends Shape{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    int area() {
        System.out.println("Area of square is...");
        return side*side;
    }

    @Override
    int perimerter() {
        System.out.println("Perimeter of square is...");
        return 4*side;
    }
}
class Rectangle extends Shape{

    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    int area() {
        System.out.println("Area of rectangle is...");
        return length*breadth;
    }

    @Override
    int perimerter() {
        System.out.println("Perimeter of rectangle is...");
        return 2*(length+breadth);
    }
}
class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    int area() {
        System.out.println("Area of circle is...");
        return (int) (4*3.14*radius*radius);
    }

    @Override
    int perimerter() {
        System.out.println("Circumference of circle is...");
        return (int) (2*3.14*radius);
    }
}
public class July28_Abstraction {
    public static void main(String[] args) {
        Shape sp = new Circle(5);
        System.out.println(sp.area());
        System.out.println(sp.perimerter());
        sp = new Rectangle(9,6);
        System.out.println(sp.area());
        System.out.println(sp.perimerter());
        sp = new Square(8);
        System.out.println(sp.area());
        System.out.println(sp.perimerter());
    }
}
