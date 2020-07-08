package ConditionalStatement;

public class NestedIf {
    public static void main(String[] args) {

        // and operator
//        int std = 12;
//
//        if (std == 10 && std==12)
//        {
//            System.out.println("And block is executed here : (You Can Give the Board exam)");
//        }
//
//        if (std == 10 || std == 12)
//        {
//            System.out.println("Or Block Is Executed here : (You can give board exam)");
//        }
//        if (!(std == 10 || std == 12))
//        {
//            System.out.println("Not operator is executed here : (You can not give board exam )");
//        }

        // Nested if else

        int a = 5 , b = 7, c = 8;

        int result = 0 ;

        if (a > b)
        {
            if (a > c)
            {
                result = a;
            }
            else
            {
                result = c;
            }
        }

        if (a < b)
        {
            if (b > c)
            {
                result = b;
            }
            else
                {
                    result = c;
                }
        }

        System.out.println(result);

    }
}
