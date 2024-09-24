import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
        int sum=0,ld;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("sum of the number is:");
        while(n!=0){
            ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        System.out.println(sum);

    }
}
