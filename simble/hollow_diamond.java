public class hollow_diamond {
    public static void main(String[]args){
        int n = 5;
        for(int r = 1; r<=2*n; r++){
            int i = n - Math.abs (n-r);
            String row = "*";
            if (i>1)
                row += " ".repeat(2*i-3) + "*";
            System.out.println(" ".repeat(n-i)+row);
        }
    }
    
}


public class hollow_diamond {
    public static void main(String[]args){
        int n = 4;
        for(int r = 1; r<=2*n; r++){
            int i = n - Math.abs (n-r);
            String row = "*";
            if (i>1)
                row += " ".repeat(2*i-3) + "*";
            System.out.println(" ".repeat(n-i)+row);
        }
    }
    
}
