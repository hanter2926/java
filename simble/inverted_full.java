public class inverted_full {
    public static void main(String[]args){
        int n =5;
        for(int i=n; i>=1; i--){
            System.out.println(" ".repeat(n-i)+"*".repeat(2*i-1));
        }
    }
    
}
