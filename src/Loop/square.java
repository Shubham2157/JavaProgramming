package Loop;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base and the Power ");
        int base = sc.nextInt();
        int pow = sc.nextInt();

        int res =1;

        for (int i = 0; i< pow; i++)
        {
            res *= base;
        }

        System.out.println(res);

    }
}
