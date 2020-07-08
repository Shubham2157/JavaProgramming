package Calculator;

import java.util.Scanner;

public class calculator {

     public static void main(String[] args) {

         int num1, num2, res;
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the first No");
         num1 = sc.nextInt();

         System.out.println("Ënter second no");
         num2 = sc.nextInt();

         res = num1 + num2;

         System.out.println("The result is : > " + res);

    }
}
