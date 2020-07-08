package Array2D;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimmension of Matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a[][] = new int[m][n];

        System.out.println("Now Enter the Metrix value");
        {
            for (int i = 0; i<m; i++)
            {
                for (int j = 0; j<n; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
        }

//        System.out.println("Enter the demension of 2 Matrix");
//        int o = sc.nextInt();
//        int p = sc.nextInt();

        int b[][] = new int[m][n];

        System.out.println("Now Enter the Metrix value");
        {
            for (int i = 0; i<m; i++)
            {
                for (int j = 0; j<n; j++)
                {
                    b[i][j] = sc.nextInt();
                }
            }
        }

        int res[][] = new int[m][n];

        for (int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("The result of entered matrix i -------- ");

        for (int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
