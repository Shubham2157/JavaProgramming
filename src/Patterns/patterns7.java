package Patterns;

import java.util.Scanner;

public class patterns7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of index");
        int n = sc.nextInt();

        int num = 1;

        for (int i =1; i<=n; i++)
        {
            for (int j =1 ;j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print(num++ +"  ");
            }
            System.out.println();
        }
    }
}
