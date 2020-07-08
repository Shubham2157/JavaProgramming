package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionEndOfFile {
    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);
            int i=0;
            while(scan.hasNextLine())
            {
                String str=scan.nextLine();
                if (str.contains("end-of-file"))
                {
                    i++;
                    System.out.println(i+" "+str);
                    break;
                }
                else
                {
                    i++;
                    System.out.println(i+" " +str);
                }
            }
        }

}
