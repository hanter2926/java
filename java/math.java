public class math {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 7;

        int sum = a + b + c;
        int sub1 = c - a;
        int sub2 = a - b;
        int multi = a * b * c;
        double div = (double)(a + b) / c; 
        System.out.println("Sum: " + sum);
        System.out.println("Sub1(c - a): " + sub1);
        System.out.println("Sub2(a - b): " + sub2);
        System.out.println("Multiplication: " + multi);
        System.out.println("Division: " + div);
    }
}