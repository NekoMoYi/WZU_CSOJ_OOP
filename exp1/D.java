import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                sum += a;
            }
            float avg = (float) sum / m;
            System.out.printf("%.2f\n", avg);
        }
        sc.close();
    }
}
