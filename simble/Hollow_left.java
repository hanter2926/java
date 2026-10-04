public class Hollow_left {
    public static void main(String[]args){
        int n = 5;
        for(int i = 1; i<=n; i++){
            String row ="*".repeat(i);
            if (i>1&& i<n){
                row = "*" + " ".repeat(i-2)+"*";
            }
                System.out.println(row);

            }
        }                                                                                                                               
    }