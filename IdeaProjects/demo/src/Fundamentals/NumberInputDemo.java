package Fundamentals;

import java.util.Scanner;

public class NumberInputDemo {
    public static void main(String[] args) {

        Scanner gradeScanner = new Scanner(System.in);

        System.out.println("my first grade is");
        double firstGrade = gradeScanner.nextDouble();

        System.out.println("my second grade is");
        double secondGrade = gradeScanner.nextDouble();

        System.out.println("my third grade is");
        double thirdGrade = gradeScanner.nextDouble();

        double sumGrade = (firstGrade + secondGrade + thirdGrade);

        String myAvgGrade = String.format("%.2f", sumGrade);

        System.out.println("myAvgGrade is " + myAvgGrade);

        gradeScanner.close();
    }
}
