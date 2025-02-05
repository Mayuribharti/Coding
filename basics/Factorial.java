package basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter an Integer:");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int fact =1;
        for(int i = 2 ; i<=n ; i++){
            fact = fact*i;
        }

        System.out.println("Factorial of "+n+" : "+fact);
    }
}
