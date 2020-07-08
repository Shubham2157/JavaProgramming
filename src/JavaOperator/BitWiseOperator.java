package JavaOperator;

public class BitWiseOperator {
    public static void main(String[] Kuch_Bhi_Ho_Sakta_Hai_covensaly_args) {

        //Bitwise operator like AND, OR, XOR, NOT, ETC
        // 5 ->       101
        // 6 ->       110
        //           -----
        // 5 AND 6 -> 100 (4)

        // lets code -----

        int a = 5;
        int b = 6;

        int c = a & b;

        System.out.println("After And Operation of 5 And 6 = " + c);

        // 10 ->        1010
        // 13 ->        1101
        // 10 OR 13 ->  1111 (15)

        int d = 10;
        int e = 13;

        int f = d | e;

        System.out.println("After And Operation of 5 OR 6 = " + f);

        // Right Sift
        // 1101(13) -> 0110(6) -> 0011(3) -> 0001(1) -> 0000(0)
        // Algo -> after one right sift no is divided by 2

        int g = e >> 1;
        // here 1 represent no of time we sift in this case 1 time (>>) represent Right Shift

        System.out.println("After rotation : " + g);

        int h = e << 1;
        // here 1 represent no of time we sift in this case 1 time (<<) represent Right Shift
        // Algo -> after one left sift no is multiply by 2
        System.out.println("After rotation : " + h);

//------------------------------------------------------------------------------------------------------------------

        System.out.println("*******************************************************************************");

        // Assignment Operator

        // =,  +=,  -=,  *= ;;;;;;;

        // eg int a = 5; here we assign a = 5;

        System.out.println("Assignment Operator");

        a = 6;

        a += 2; // a = a + 2 -> 6 + 2 = 8

        System.out.println(a);

    }
}
