class EvenOddExample {
    public static void main(String[] args) {

        int number = 10;

        boolean isEven = (number % 2 == 0);

        if (isEven) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}