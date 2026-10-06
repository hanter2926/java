// number.importjava.io.*;
// import 
// java.util.*;class
// fact{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n =sc.nextInt();
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         System.out.println("factorial of the number is:"+fact);

//     }
// }


import java.io.*;
import java.util.*; class Fact{
public static void main(String args[]){ Scanner sc=new Scanner(System.in); System.out.println("Enter a Number"); int n=sc.nextInt();
int fact=1;
for(int i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("Factorial of "+n+" is :"+fact);
}

}
