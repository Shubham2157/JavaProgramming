package Patterns;

import java.util.Scanner;

public class Patterns2 {
    public static void main(String[] args) {
        System.out.println("Enter The no Of index");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i =1; i<=n ; i++){
            for (int j =1; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
