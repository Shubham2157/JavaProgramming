package WhileLoop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter a Number");
            n = sc.nextInt();
            System.out.println("Number is : " + n);
        }while (n != 0);
    }
}
