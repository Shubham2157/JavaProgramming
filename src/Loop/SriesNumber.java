package Loop;

// 1 - 1/2 + 1/3 - 1/4 + ..... - 1/n

import java.util.Scanner;

public class SriesNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        float res = 0;

        for (float i = 1; i<=n; i++)
        {
            if (i % 2 == 0){
                res -= 1/i;
            }else {
                res += 1/i;
            }
        }
        System.out.println(res);

    }
}
