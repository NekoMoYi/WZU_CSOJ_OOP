import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next(), s2 = sc.next();
            int windowSize = sc.nextInt();
            int i = 0, j = 0;
            int max = 0;
            int pos1 = -1, pos2 = -1;
            for (i = 0; i < s1.length(); i++) {
                for (j = 0; j < s2.length(); j++) {
                    int cnt = 0;
                    for (int k = 0; k < windowSize; k++) {
                        if ( i + k >= s1.length() || j + k >= s2.length() || s1.charAt(i + k) != s2.charAt(j + k)) {
                            break;
                        }
                        cnt++;
                    }
                    if (cnt > max) {
                        max = cnt;
                        pos1 = i;
                        pos2 = j;
                    }
                }
            }
            String res = "";
            while (pos1 < s1.length() && pos2 < s2.length() && s1.charAt(pos1) == s2.charAt(pos2)) {
                res += s1.charAt(pos1);
                pos1++;
                pos2++;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
