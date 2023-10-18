import java.util.Scanner;

public class D {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double radius, length, width;
    radius = in.nextDouble();
    Shape circle = new Circle(radius);
    System.out.println(String.format("%.2f", circle.calArea()));
    length = in.nextDouble();
    width = in.nextDouble();
    Shape rectangle = new Rectangle(length, width);
    System.out.println(String.format("%.2f", rectangle.calArea()));
  }
}

abstract class Shape {

  public abstract double calArea();
}

class Rectangle extends Shape {

  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double calArea() {
    return length * width;
  }
}

class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double calArea() {
    return 3.14 * radius * radius;
  }
}
