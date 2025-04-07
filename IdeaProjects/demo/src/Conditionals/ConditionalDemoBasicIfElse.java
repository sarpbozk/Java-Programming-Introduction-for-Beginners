package Conditionals;

import java.util.Scanner;

public class ConditionalDemoBasicIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("your age: ");
        int age = scanner.nextInt();
        System.out.print("are you a local ? (say true or false)");
        boolean citizenship = scanner.nextBoolean();
        boolean eligible = age >= 18;
        boolean localCitizen  = citizenship == true;

//        if (localCitizen && eligible) {
//            System.out.println("you can vote");
//        } else {
//            System.out.println("you can't vote");
//        }

        System.out.println((eligible && localCitizen) ? "you can vote" : "you cant vote");
    }
}
