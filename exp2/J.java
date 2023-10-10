import java.util.Scanner;

class Complex {
    private double a;
    private double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public Complex() {
        this.a = 0;
        this.b = 0;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    public Complex add(Complex c) {
        double newA = this.a + c.a;
        double newB = this.b + c.b;
        return new Complex(newA, newB);
    }

    public Complex subtract(Complex c) {
        double newA = this.a - c.a;
        double newB = this.b - c.b;
        return new Complex(newA, newB);
    }

    public Complex multiply(Complex c) {
        double newA = this.a * c.a - this.b * c.b;
        double newB = this.a * c.b + this.b * c.a;
        return new Complex(newA, newB);
    }

    public Complex divide(Complex c) {
        double denominator = c.a * c.a + c.b * c.b;
        double newA = (this.a * c.a + this.b * c.b) / denominator;
        double newB = (this.b * c.a - this.a * c.b) / denominator;
        return new Complex(newA, newB);
    }

    @Override
    public String toString() {
        if (a >= 0 && a < 0.01) {
            if (b >= 0 && b < 0.01) {
                return "0.00";
            } else {
                return String.format("%.2fi", b);
            }
        } else {
            if (b >= 0 && b < 0.01) {
                return String.format("%.2f", a);
            } else {
                return String.format("%.2f%+.2fi", a, b);
            }
        }
    }
}


public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();

        Complex c1 = new Complex(a1, b1);
        Complex c2 = new Complex(a2, b2);

        System.out.printf("Real:%.2f imaginary:%.2f Fabs:%.2f\n", c1.getA(), c1.getB(), c1.abs());
        System.out.printf("Real:%.2f imaginary:%.2f Fabs:%.2f\n", c2.getA(), c2.getB(), c2.abs());

        Complex sum = c1.add(c2);
        System.out.printf("%s\n", sum);

        Complex diff = c1.subtract(c2);
        System.out.printf("%s\n", diff);

        Complex product = c1.multiply(c2);
        System.out.printf("%s\n", product);

        Complex quotient = c1.divide(c2);
        System.out.printf("%s\n", quotient);
        sc.close();
    }
}
