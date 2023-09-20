import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
        sc.close();
    }
}
