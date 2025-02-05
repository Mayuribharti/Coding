package basics;

import java.util.Scanner;

public class AllPrimeNumbersUptoN {
    public static void main(String[] args) {

        System.out.println("Enter an integer :");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i =2 ; i<= n ;i++){

            int prime=0;
            for(int j =2 ; j<=i/2 ; j++){
                if (i%j==0){
                    prime=1;
                    break;
                }
            }
            if(prime==0){
                System.out.println(i);
            }

        }
    }
}
