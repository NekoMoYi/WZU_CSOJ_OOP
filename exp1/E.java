import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.next();
            String t = sc.next();
            int i = 0, j = 0;
            while(i < s.length() && j < t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    i++;
                }
                j++;
            }
            if(i == s.length()){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
