import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius1 = sc.nextDouble();
        double radius2 = sc.nextDouble();
        ComparableCircle circle1 = new ComparableCircle(radius1);
        ComparableCircle circle2 = new ComparableCircle(radius2);
        if (circle1.compareTo(circle2) > 0) {
            System.out.printf("The max circle's area is %.2f", circle1.getArea());
        } else {
            System.out.printf("The max circle's area is %.2f", circle2.getArea());
        }
        sc.close();
    }
}
