package basics;

import java.util.Scanner;

//wrong
public class FindEvenSumOfUptoNInFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0 ;
        int b = 1 ;
        int c ;
        int sum =0;
        for(int i = 2 ; i<n ; i++){

            c=a+b;
            if(c%2==0){
                sum = sum+c;
            }
            a=b;
            b=c;
        }
        System.out.println(sum);
    }
}
