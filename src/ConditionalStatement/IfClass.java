package ConditionalStatement;

import java.util.Scanner;

public class   IfClass {

    public static void main(String[] args) {

//        int age ;
//
//        Scanner  sc = new Scanner(System.in);
//        System.out.println("Enter your age");
//        age = sc.nextInt();
//
//        if (age >= 18)
//        {
//            System.out.println("You are eligible for vote");
//        }
//        else
//        {
//            System.out.println("Sorry, You Are Not eligible for vote");
//        }
//

        int b = 8;
        int c = 5;

        int maxOfTwoNumber = 0;

        // if Else using ternary operator
        // variable = condition ? true expression : false expression ;

        maxOfTwoNumber = ( b > c)? b : c;

        System.out.println( "Max Of Two Number" + maxOfTwoNumber);

    }

}
