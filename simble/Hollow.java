public class Hollow {
    public static void main(String[]args){
        int n = 5;
        for(int i = 0; i<n; i++){
            String row = (i == 0 || i == n-1) ? "*".repeat(n): "*"+ " ".repeat(n-2) +"*";
            System.out.println(row);
        }
    }
}
                                                                                                                                                