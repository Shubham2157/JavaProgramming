package WhileLoop;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number");

        int n = sc.nextInt();
        int temp = n; // Variable Initialisation
        int sum = 0;

        // to find the number of digits
        // log (base 10) no + 1= no of digits

        int noofdigits = (int)Math.log10(n) +1;

        System.out.println(noofdigits);

        while (temp>0) // Condition
        {
            int lastdigit = temp % 10;
            temp /= 10;  // variable reinitialisation
            sum += lastdigit;
        }
        System.out.println("The Sum of " + n + " digits = " + sum);
    }
}
