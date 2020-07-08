package SwitchCaseStatements;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int dayofweek;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A day Number in a Week");
        dayofweek = sc.nextInt();

        switch (dayofweek)
        {
            case 1 | 8 :  System.out.println("Today is Sunday");
                    break;

          // 2 Method for merging   case 1 :
          //                        case 2 : Statement break;

            case 2 : System.out.println("Today is Monday");
                    break;

            case 3 : System.out.println("Today Is Tuesday");
                    break;

            case 4 : System.out.println("Today is Wednesday");
                    break;

            case 5 : System.out.println("Today is Thursday");
                    break;

            case 6 : System.out.println("Today is friday");
                    break;

            case 7 : System.out.println("Today is Saturday");
                    break;

            default: System.out.println("Please enter valid day Number");

        }


    }
}
