package basics;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter an integer : ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("a :"+a+", b : "+b);

    }
}
