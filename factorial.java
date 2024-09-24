import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number of which you want the factorial:");
        int n=obj.nextInt();
        System.out.println("Factorial of the number is:");
        for(int i=1 ; i<=n; i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    
}
