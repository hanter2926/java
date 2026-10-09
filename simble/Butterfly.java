
public class Butterfly {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i < 2 * n; i++) {
            int a = n - Math.abs(n - i);

            String wing = "* ".repeat(a);
            String gap = "  ".repeat(2 * (n - a));

            System.out.println(wing + gap + wing);
        }
    }
}
