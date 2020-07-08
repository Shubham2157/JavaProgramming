package Loop;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a no to check prime or not");

        int n = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i*i<n; i++)
        // if the no is prime then it lies between 1 < factorial root under(n)

        {
            if (n%i == 0){
                isPrime = false;
                break;
            }
        }

        if (n<2)
            isPrime = false;

        System.out.println("Is Prime : "+isPrime);
    }
}
