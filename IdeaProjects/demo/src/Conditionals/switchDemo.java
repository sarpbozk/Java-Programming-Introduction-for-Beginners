package Conditionals;

import java.util.Scanner;

public class switchDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

//        switch (month) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("q1");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("q2");
//                break;
//            case 7:
//            case 8:
//            case 9:
//                System.out.println("q3");
//                break;
//            case 10:
//            case 11:
//            case 12:
//                System.out.println("q4");
//                break;
//            default:
//                System.out.println("invalid month no");
//
//        }

        switch (month) {
            case 1, 2, 3 -> System.out.println("q1");
            case 4, 5, 6 -> System.out.println("q2");
            case 7, 8, 9 -> System.out.println("q3");
            case 10, 11, 12 -> System.out.println("q4");
            default -> System.out.println("invalid input");
        }
    }
}
