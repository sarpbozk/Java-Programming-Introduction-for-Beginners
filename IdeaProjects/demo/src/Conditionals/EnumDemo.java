package Conditionals;

import java.util.Scanner;

public class EnumDemo {
    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String monthStr = scanner.next();
        try {
            Month month = Month.valueOf(monthStr.toUpperCase());
            System.out.println("you selected" + month);
        } catch (IllegalArgumentException exc) {
            System.out.println("type is invalid" + monthStr);
            System.exit(1);
        } finally {
            scanner.close();
        }


        Month month = Month.valueOf(monthStr.toUpperCase());

        switch (month) {
            case Month.JANUARY, FEBRUARY, MARCH -> System.out.println("q1");
            case APRIL, MAY, JUNE -> System.out.println("q2");
            case JULY, AUGUST, SEPTEMBER -> System.out.println("q3");
            case OCTOBER, NOVEMBER, DECEMBER -> System.out.println("q4");
            default -> System.out.println("invalid input");
        }
        scanner.close();
    }
}
