package Patterns;

import java.util.Scanner;

public class Patterns6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of index");
        int n = sc.nextInt();

        for (int i =1; i<=n; i++)
        {
            for (int j =1 ;j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
