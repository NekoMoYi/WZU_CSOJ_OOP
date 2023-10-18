import java.util.Scanner;
abstract class GeometricObject {
    public abstract double computeArea();
}

class Rectangle extends GeometricObject {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double computeArea() {
        return length * width;
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}

public class B {
    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject obj : a) {
            sum += obj.computeArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectangle r1 = new Rectangle(in.nextDouble(), in.nextDouble());
        Rectangle r2 = new Rectangle(in.nextDouble(), in.nextDouble());
        Circle c1 = new Circle(in.nextDouble());
        Circle c2 = new Circle(in.nextDouble());
        GeometricObject[] arr = {r1, r2, c1, c2};
        System.out.printf("%.2f", sumArea(arr));
        in.close();
    }
}
