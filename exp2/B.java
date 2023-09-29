import java.util.Scanner;

class Cylinder {
    int radius;
    int height;
    double PI = 3.14;

    Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return PI * radius * radius * height;
    }
}

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        Cylinder c = new Cylinder(radius, height);
        System.out.println(String.format("%.2f", c.getVolume()));
        sc.close();
    }
}
