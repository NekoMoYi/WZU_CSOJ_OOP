import java.lang.Comparable;

abstract class GeometricObject implements Comparable<GeometricObject> {

  private String name;
  private double area;

  public GeometricObject(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public static Comparable<GeometricObject> max(
    Comparable<GeometricObject> o1,
    Comparable<GeometricObject> o2
  ) {
    if (o1.compareTo((GeometricObject) o2) > 0) {
      return o1;
    } else {
      return o2;
    }
  }

  @Override
  public int compareTo(GeometricObject o) {
    if (this.area > o.area) {
      return 1;
    } else if (this.area < o.area) {
      return -1;
    } else {
      return -1;
    }
  }

  public abstract double calculateArea();
}

class Rectangle extends GeometricObject {

  private double length;
  private double width;

  public Rectangle(String name, double length, double width) {
    super(name);
    this.length = length;
    this.width = width;
    setArea(calculateArea());
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  @Override
  public double calculateArea() {
    return length * width;
  }

  @Override
  public String toString() {
    return String.format("%s %.2f %.2f %.2f", getName(), length, width, getArea());
  }
}

class Circle extends GeometricObject {

  private double radius;

  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
    setArea(calculateArea());
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public String toString() {
    return String.format("%s %.2f %.2f", getName(), radius, getArea());
  }
}

public class I {

  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    String name1 = input.next();
    double length1 = input.nextDouble();
    double width1 = input.nextDouble();
    String name2 = input.next();
    double length2 = input.nextDouble();
    double width2 = input.nextDouble();
    String name3 = input.next();
    double radius1 = input.nextDouble();
    String name4 = input.next();
    double radius2 = input.nextDouble();
    input.close();

    Rectangle rectangle1 = new Rectangle(name1, length1, width1);
    Rectangle rectangle2 = new Rectangle(name2, length2, width2);
    Circle circle1 = new Circle(name3, radius1);
    Circle circle2 = new Circle(name4, radius2);

    GeometricObject maxRectangle = (GeometricObject) GeometricObject.max(
      rectangle1,
      rectangle2
    );
    GeometricObject maxCircle = (GeometricObject) GeometricObject.max(
      circle1,
      circle2
    );

    System.out.println(maxRectangle.toString());
    System.out.println(maxCircle.toString());
  }
}
