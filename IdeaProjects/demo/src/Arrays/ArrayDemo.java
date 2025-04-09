package Arrays;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println(getAverageGrade(readUserInputs(getInputCount())));
    }

    static int getInputCount() {
        System.out.println("Enter the number of students you want to read: ");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        sc.close();
        return result;
    }

    static double[] readUserInputs(int n) {
        System.out.println("Enter the grades you want to read: ");
        Scanner sc = new Scanner(System.in);
        double[] grades = new double[n];
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextDouble();
        }
        sc.close();
        return grades;
    }

    static String getAverageGrade(double[] grades) {
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return String.format("%.2f", sum / grades.length);
    }
}
