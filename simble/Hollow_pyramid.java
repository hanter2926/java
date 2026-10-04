public class Hollow_pyramid {
    public static void main(String[]args){
        int n = 5;
        for(int i = 1; i<=n; i++){
            String row = "*";
            if (i>1 && i<n)row += " ".repeat(2*i-3) + "*";
            if (i==n)row = "*".repeat(2*n-1);
            System.out.println(" ".repeat(n-i)+row);
            
        }
    }
    
}
