package shit;

public class MatrixDemo {
    public static void main(String[] args) {
        int[][] matrix = {
                {0 * 0, 1 * 0, 2 * 0, 3 * 0},
                {0 * 1, 1 * 1, 2 * 1, 3 * 1},
                {0 * 2, 1 * 2, 2 * 2, 3 * 2},
                {0 * 3, 1 * 3, 2 * 3, 3 * 3}
        };
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
                System.out.println();
            }
        }
    }
}
