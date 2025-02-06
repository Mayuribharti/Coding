package basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter an integer");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int original=n;
        int rem;
        int sum=0;
        while(n!=0){

            rem=n%10;
            sum += rem* rem*rem;

            n=n/10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is NOT an Armstrong Number.");
        }
    }
}
