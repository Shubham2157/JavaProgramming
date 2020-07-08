package HackerRank;

import java.util.Scanner;

public class StdinAndStdout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double f = sc.nextDouble();
        sc.nextLine(); // after Double Integer if we are taking String then we have to use two input nextline
        String line = sc.nextLine();

        System.out.println("String: " + line);
        System.out.println("Double: " + f);
        System.out.println("Int: " +  x);
    }
}
