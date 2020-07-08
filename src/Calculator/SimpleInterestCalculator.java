package Calculator;

import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        double p,r,t,si;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Amount of Principal : ");
        p = scan.nextDouble();

        System.out.println("Enter Rate : ");
        r = scan.nextDouble();

        System.out.println("Enter Time : ");
        t = scan.nextDouble();


        si = (p*r*t)/100;

        System.out.println("Simple Interest of Your Input : " + si);

    }
}
