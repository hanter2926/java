package colloge;

import java.io,*;
class whether{
    public static void main(String[] args){
       int n=121, r, num=0;
       int originalnumber=n;
       while(n>0){
        r=n%10;
        num=(num*10)+r;
        n=n/10;
       }
       if(originalnumber==num){
           System.out.println("The number is a palindrome");
       }else{
           System.out.println("The number is not a palindrome");
       }
    }
    
}
