import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            int[] line = new int[col];
            for (int j = 0; j < col; j++) {
                line[j] = sc.nextInt();
            }
            matrix[i] = line;
        }
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int num = matrix[i][j];
                int[] neighbors = new int[8];
                int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
                int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };
                for (int k = 0; k < 8; k++) {
                    int x = i + dx[k], y = j + dy[k];
                    if (x >= 0 && x < row && y >= 0 && y < col) {
                        neighbors[k] = matrix[x][y];
                    } else {
                        neighbors[k] = 0;
                    }
                }
                int code = 0;
                for (int k = 0; k < 8; k++) {
                    if (num >= neighbors[k]) {
                        code += (int) Math.pow(2, k);
                    }
                }
                res[i][j] = code;
            }
        }
        for (int i = 0; i < row; i++) {
            int[] line = res[i];
            for (int j = 0; j < col; j++) {
                System.out.printf("%4d", line[j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
