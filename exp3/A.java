import java.util.Scanner;
class GeometricObject {

  private String color;
  private boolean filled;

  public GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }
}

class Triangle extends GeometricObject {

  private double side1;
  private double side2;
  private double side3;

  public Triangle() {
    super("white", false);
    side1 = 1.0;
    side2 = 1.0;
    side3 = 1.0;
  }

  public Triangle(double side1, double side2, double side3) {
    super("white", false);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public double getSide1() {
    return side1;
  }

  public void setSide1(double side1) {
    this.side1 = side1;
  }

  public double getSide2() {
    return side2;
  }

  public void setSide2(double side2) {
    this.side2 = side2;
  }

  public double getSide3() {
    return side3;
  }

  public void setSide3(double side3) {
    this.side3 = side3;
  }

  public double getArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  public String toString() {
    return (
      "Triangle: side1=" + side1 + " side2=" + side2 + " side3=" + side3 + " color=" + getColor() + " filled=" + isFilled()
    );
  }
}

public class A {

  public static void main(String[] args) {
    double e1, e2, e3;
    String color;
    boolean filled;
    Scanner input = new Scanner(System.in);
    e1 = input.nextDouble();
    e2 = input.nextDouble();
    e3 = input.nextDouble();
    color = input.next();
    filled = input.nextBoolean();
    Triangle t = new Triangle(e1, e2, e3);
    t.setColor(color);
    t.setFilled(filled);
    System.out.println(t.toString());
    System.out.printf("Area=%.2f\n", t.getArea());
    System.out.printf("Perimeter=%.2f\n", t.getPerimeter());
    input.close();
  }
}
