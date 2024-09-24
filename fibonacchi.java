import java.util.*;
public class fibonacchi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c=0;
        System.out.println("enter the nth term upto which you want the fibonacchi seris:");
        int n=sc.nextInt();
        System.out.println("The fibonachi series is:");
        System.out.println(a);
        for(int i=1 ; i<n ;i++){
           c=a+b;
           a=b;
           b=c;
           System.out.println(a);
        }

    }
}
