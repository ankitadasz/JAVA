import java.util.*;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;   // Extract the last digit
            reverse = reverse * 10 + digit;  // Add the digit to the reverse number
            number /= 10;   // Remove the last digit
        }

        System.out.println("Reversed number: " + reverse);
    }
}
