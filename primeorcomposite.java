import java.util.*;
public class primeorcomposite {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no for which you want to check for prime or composite:");
        int n=sc.nextInt();
        for(int i=2; i<=n-1 ; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count!=0){
            System.out.println("Its not a prime number");
        }
        else{
            System.out.println("its a prime number");
        }
    }
    
}
