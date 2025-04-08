package loops;

import java.util.Scanner;

public class doWhileLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer n = scanner.nextInt();
        Integer count = 0;

        do {
            count++;
            if (count % 5 == 0) {
                continue;
            }
            if (count == n-2) {
                break;
            }
            System.out.println(count);
        } while (count < n);



        scanner.close();
    }
}
