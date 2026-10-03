public class soild_dimond {
    public static void main(String[]args){
        int n = 5;
        for(int r = 1; r<=2*n; r++){
        int i = n - Math.abs (n-r);
        System.out.println(" ".repeat(n-i)+"*".repeat(2*i-1));

        
    }
    
  }
    
}
