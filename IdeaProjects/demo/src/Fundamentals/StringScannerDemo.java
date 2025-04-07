package Fundamentals;

import java.util.Scanner;

public class StringScannerDemo {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);



        System.out.print("your fav color ? ");

        String color = myScanner.nextLine();

        System.out.print("your fav number ?");

        String no = myScanner.next();

        System.out.println("your fav color " + color + " your fav number " + no);

        myScanner.close();
    }
}
