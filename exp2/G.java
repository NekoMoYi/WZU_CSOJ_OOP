import java.util.Scanner;

class Cuboid {
    private int length;
    private int width;
    private int height;

    public Cuboid(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public int getBottomArea() {
        return length * width;
    }

    public int getVolume() {
        return length * width * height;
    }
}

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuboid c = new Cuboid(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(c.getBottomArea());
        System.out.println(c.getVolume());
        sc.close();
    }
}
