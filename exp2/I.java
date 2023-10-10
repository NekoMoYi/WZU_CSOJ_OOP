import java.util.ArrayList;
import java.util.Scanner;

class Loan {

  private double loan;

  public Loan(double loan) {
    this.loan = loan;
  }

  public String toString() {
    return String.format("Loan: %.2f", loan);
  }
}

class MyDate {

  private String date;

  public MyDate(String date) {
    this.date = date;
  }

  public String toString() {
    return "Date: " + date;
  }
}

class Frame {

  private String frameName;

  public Frame(String frameName) {
    this.frameName = frameName;
  }

  public String toString() {
    return "Frame: " + frameName;
  }
}

class Circle {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public String toString() {
    return "Circle: " + radius;
  }
}

public class I {

  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    list.add(new Loan(sc.nextDouble()));
    list.add(new MyDate(sc.next()));
    list.add(sc.next());
    list.add(new Frame(sc.next()));
    list.add(new Circle(sc.nextDouble()));

    for (Object obj : list) {
      System.out.println(obj.toString());
    }
    sc.close();
  }
}
