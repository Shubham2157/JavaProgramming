package ArraysIntro;

import java.util.Scanner;

public class AvgMarksOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No Of student in your class");

        int n = sc.nextInt();

        System.out.println("Enter marks of students");

        int marks[] = new int[n];
        double tot =0;

        for (int i = 0; i<marks.length; i++)
        {
            marks[i] = sc.nextInt();
            tot += marks[i];
        }
        System.out.println("avg marks = " + (tot/n));
    }
}
