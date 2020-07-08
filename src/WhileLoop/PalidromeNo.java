package WhileLoop;

import java.util.Scanner;

public class PalidromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number");

        int n = sc.nextInt();

        int temp = n;
        int reverse = 0;

        while (temp > 0)
        {
            int lastdigit = temp % 10;

            temp /= 10;

            reverse = reverse * 10 + lastdigit;
        }
        if (n == reverse)
        {
            System.out.println(n + " is Palindrome");
        }
        else
            {
                System.out.println(n + " is not Palindrome");
            }
    }
}
