import java.util.Scanner;

abstract class Shape {

  public double PI = 3.14;

  public abstract double getArea();

  public abstract double getVolume();
}

class Cylinder extends Shape {

  private double r, h;

  public Cylinder(double r, double h) {
    this.r = r;
    this.h = h;
  }

  @Override
  public double getArea() {
    return 2 * PI * r * r + 2 * PI * r * h;
  }

  @Override
  public double getVolume() {
    return PI * r * r * h;
  }
}

class Sphere extends Shape {

  private double r;

  public Sphere(double r) {
    this.r = r;
  }

  @Override
  public double getArea() {
    return 4 * PI * r * r;
  }

  @Override
  public double getVolume() {
    return 4.0 / 3.0 * PI * r * r * r;
  }
}

class Cube extends Shape {

  private double a;

  public Cube(double a) {
    this.a = a;
  }

  @Override
  public double getArea() {
    return 6 * a * a;
  }

  @Override
  public double getVolume() {
    return a * a * a;
  }
}

class Cuboid extends Shape {

  private double a, b, c;

  public Cuboid(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public double getArea() {
    return 2 * (a * b + b * c + c * a);
  }

  @Override
  public double getVolume() {
    return a * b * c;
  }
}

public class C {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      Shape[] shapes = new Shape[4];
      shapes[0] = new Cylinder(in.nextDouble(), in.nextDouble());
      shapes[1] = new Sphere(in.nextDouble());
      shapes[2] = new Cube(in.nextDouble());
      shapes[3] = new Cuboid(in.nextDouble(), in.nextDouble(), in.nextDouble());
      for (Shape shape : shapes) {
        System.out.printf("%.2f %.2f\n", shape.getArea(), shape.getVolume());
      }
    }
    in.close();
  }
}
