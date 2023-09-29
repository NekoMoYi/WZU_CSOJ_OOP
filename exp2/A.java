import java.util.Scanner;

class Cube {
    private double edge;
    private double volume;
    private double area;

    public Cube(double edge) {
        this.edge = edge;
    }

    public void calcVolume() {
        this.volume = this.edge * this.edge * this.edge;
    }

    public void calcArea() {
        this.area = 6 * this.edge * this.edge;
    }

    public void display() {
        System.out.println(String.format("Volume:%.2f; Area:%.2f", this.volume, this.area));
    }
}

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            double edge = sc.nextDouble();
            Cube cube = new Cube(edge);
            cube.calcVolume();
            cube.calcArea();
            System.out.print(String.format("obj%d ", i + 1));
            cube.display();
        }
        sc.close();
    }
}