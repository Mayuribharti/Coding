package basics;

import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int rem;
        int count=0;
        while(n!=0){
            rem= n%10;
            count=count+1;
            n=n/10;
        }
        System.out.println("Count :"+count);
    }
}
