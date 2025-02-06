package basics;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println("Enter an integer: ");

        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();

        int rem;
        int sum=0;
        while(n!=0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }

        System.out.println("Sum of digits : "+sum);
    }
}
