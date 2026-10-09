
public class SolidRhombus {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            System.out.println(
                " ".repeat(n - i - 1) +
                "*".repeat(n)
            );
        }
    }
}
