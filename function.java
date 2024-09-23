import java.util.*;
public class function {
 
    public static void printhelloworld(){
        System.out.println("Hello Ankita");
        System.out.println("Hello Ankita");
        System.out.println("Hello Ankita");
    }
    public static void sumoftwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("sum of this two number is:"+c);
    }
    public static void main(String[] args) {
        printhelloworld();
        sumoftwo();
    }
}
