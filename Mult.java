import java.util.Scanner;

class Mult{
    public static void main(String[] args){
        int num, i;
        System.out.println("Enter any number");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();
        for(i=1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}