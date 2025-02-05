package basics;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {

        System.out.println("Enter an integer:");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int j =n;

        int squareOfN= n*n;

        int rem;
        int sum=0;
        while(squareOfN!=0){
            rem=squareOfN%10;
            sum = rem+sum;
            squareOfN=squareOfN/10;
        }

        if(sum==j){
            System.out.println("Neon Number");
        }else{
            System.out.println("Not");
        }

    }
}
