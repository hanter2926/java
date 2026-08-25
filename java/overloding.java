class overloding {
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    int sum(int a, int b, int c, int d){
        return a+b+c+d;}


    public static void main(String[] args) {
        overloding obj = new overloding();
        System.out.println("Sum of two numbers: " + obj.sum(10, 20));
        System.out.println("Sum of three numbers: " + obj.sum(10, 20, 30));
        System.out.println("Sum of four numbers: " + obj.sum(10, 20, 30, 40));
    }
}

