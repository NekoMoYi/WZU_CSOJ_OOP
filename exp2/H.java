import java.util.Scanner;

class Point {
    double x, y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    Point() {
        this(0.0, 0.0);
    }
    public String toString() {
        return String.format("x=%.2f,y=%.2f", x, y);
    }
}

class Circle {
    Point center;
    double radius;
    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    Circle(double radius) {
        this(new Point(), radius);
    }
    Circle() {
        this(0.0);
    }
    public String toString() {
        return String.format("%s\nradius=%.2f", center, radius);
    }
}

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new Circle());
        while (n-- > 0) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double r = sc.nextDouble();
            System.out.println(new Circle(new Point(x, y), r));
        }
    }
}