
public class Hourglass {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i < 2 * n; i++) {
            int a = Math.abs(n - i) + 1;

            System.out.println(
                " ".repeat(n - a) +
                "*".repeat(2 * a - 1)
            );
        }
    }
}
