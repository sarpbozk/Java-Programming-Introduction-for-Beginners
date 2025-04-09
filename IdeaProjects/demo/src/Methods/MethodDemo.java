package Methods;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you wish to enter: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements you wish to enter: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Integer result = sum(arr);
        int sum = (result != null) ? result : 0;
        System.out.println("The sum of the overrided method is " + sum(1,4,2));
        System.out.println(sum);
        scanner.close();
    }

    private static Integer sum(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("There are no elements");
            return null;
        }
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }
}