package Loop;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) // Infinity loop
        {
            System.out.println("Enter No : ");
            int n = sc.nextInt();

            if (n <0){
                break;
            }
        }
    }
}
