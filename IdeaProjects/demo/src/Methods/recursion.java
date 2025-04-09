package Methods;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println(factorial(n));
        sc.close();
    }

    private static Integer factorial(int n) {
        if (n < 0) {
            System.out.println("negative number");
            return null;
        }
        return n == 1 ? 1 : n * factorial(n - 1);
    }
}
