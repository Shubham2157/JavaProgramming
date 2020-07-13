package GeeksForGeeks;

import java.util.*;
import java.lang.*;
import java.io.*;


public class   RotateArray {
        public static void main (String[] args) {
            //code
            Scanner scan = new Scanner(System.in);
            int T = scan.nextInt();

//            for(int p = 0; p<T; p++)
//            {
//                int N = scan.nextInt();
//                int D = scan.nextInt();
//
//                int s[] = new int[N];
//
//                for(int i = 0; i<N; i++)
//                {
//                    s[i] = scan.nextInt();
//                }
//
//                for(int i = D; i<N; i++)
//                {
//                    System.out.print(s[i]+" ");
//                }
//                for(int i = 0; i<D; i++)
//                {
//                    System.out.print(s[i]+" ");
//                }
//                System.out.println();
//            }
            for(int p = 0; p<T; p++)
            {
                int N = scan.nextInt();
                int D = scan.nextInt();

                int s[] = new int[N];

                for(int i = 0; i<N; i++)
                {
                    s[(i+N-D)%N] = scan.nextInt();
                }

                for(int i = 0; i<N; i++)
                {
                    System.out.print(s[i]+" ");
                }
                System.out.println();
            }


        }

}
