public class spiral {

    public static void main(String args[]) {

        int n = 5;

        int[][] mat = new int[n][n];

        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        int num = 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                mat[top][i] = num;
                num += 1;
            }
            top += 1;

            for (int i = top; i <= bottom; i++) {
                mat[i][right] = num;
                num += 1;
            }
            right -= 1;

            for (int i = right; i >= left; i--) {
                mat[bottom][i] = num;
                num += 1;
            }
            bottom -= 1;

            for (int i = bottom; i >= top; i--) {
                mat[i][left] = num;
                num += 1;
            }
            left += 1;
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }
    }
}