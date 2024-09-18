import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a and b:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("the value of a and b are:"+a +" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping the value of a and b:");
        System.out.println("a="+a);
        System.out.println("b="+b);
        
    }
    
}
