public class F {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10 && j != i; j++) {
                int num = i * 1100 + j * 11;
                int sq = (int) Math.sqrt(num);
                if (sq * sq == num) {
                    System.out.println(num);
                    return;
                }
            }
        }
    }
}
