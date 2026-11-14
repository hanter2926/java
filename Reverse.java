
import java.util.Scanner;

class Reverse{
    public static void main(String[] args) {

        int n, r;

        System.out.println("Enter a number");

        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();

        while (n > 0) {
            r = n % 10;
            System.out.println("Reverse: " + r);
            n = n / 10;
        }

        ref.close();
    }
}
