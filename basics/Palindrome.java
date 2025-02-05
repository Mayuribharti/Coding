package basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter an Integer : ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int j = n;
        int rem;
        int palindrome=0;
        while(n!=0){
            rem=n%10;
            palindrome=palindrome*10+rem;
            n=n/10;
        }

        if(j==palindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }

}
