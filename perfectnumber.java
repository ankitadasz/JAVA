import java.util.*;
public class perfectnumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = obj.nextInt();
        
        // Find divisors and calculate sum of proper divisors
        for (int i = 1; i < n; i++) {  // Proper divisors are less than n
            if (n % i == 0) {
                sum = sum+i;  // Add the divisor to the sum
            }
        }
        
        // Check if the sum of divisors equals the original number
        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
}
