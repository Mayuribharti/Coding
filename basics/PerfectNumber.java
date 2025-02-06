package basics;

import java.util.Scanner;

public class PerfectNumber {

  /*  A number is perfect if the sum of its proper divisors equals the number itself.
    Example:
    Input: 6
    Output: Perfect (Divisors: 1, 2, 3 → 1+2+3 = 6)*/
    public static void main(String[] args) {
        System.out.println("Enter an integer : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum =0;

        for(int i =1  ; i<n ; i++){
            if(n%i==0){
                sum = sum+i;
            }
        }

        if(sum==n){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a perfect Number");
        }

    }
}
