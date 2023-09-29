import java.util.Scanner;

class Circle {
    private int x, y, r;
    private double PI = 3.14;

    public Circle() {
        this(0, 0, 1);
    }

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int calDiameter() {
        return 2 * r;
    }

    public double calArea() {
        return PI * r * r;
    }

    public double calPerimeter() {
        return 2 * PI * r;
    }

    public void output() {
        System.out.println(String.format("Center=(%d,%d) and Radius=%d", x, y, r));
        System.out.println(String.format("Diameter=%d", calDiameter()));
        System.out.println(String.format("Area=%.1f", calArea()));
        System.out.println(String.format("Perimeter=%.1f", calPerimeter()));
    }
}

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, r;
        x = sc.nextInt();
        y = sc.nextInt();
        r = sc.nextInt();
        Circle c = new Circle(x, y, r);
        c.output();
        sc.close();
    }
}
