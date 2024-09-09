import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n, count = 0;
        System.out.print("Enter a number: ");
        n = r.nextInt();
        
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        
        if (count == 0) {
            System.out.println("It's a prime number");
        } else {
            System.out.println("It's not a prime number");
        }
    }
}
