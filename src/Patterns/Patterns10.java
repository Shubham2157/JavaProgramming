package Patterns;

import java.util.Scanner;

public class Patterns10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int j;
        int k;
        for (i=1;i<=n;i++ )
        {
            for (j=n;j>i;j--)
            {
                System.out.print("  ");
            }
            for(k=i-1;k>=-(i-1);k--)
            {
                System.out.print(" "+(i-Math.abs(k)));
            }
            System.out.println();
        }
    }
}
