package basics;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        // A number is strong if the sum of the factorials of its digits equals the number.
        //Example:Input: 145
        //Output: Strong (1! + 4! + 5! = 1 + 24 + 120 = 145)

        System.out.println("Enter an integer:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int j =n;
        int rem;
        int sum=0;

        while(n!=0){
            rem= n%10;
            int fact =1;
            for(int i =1 ; i<=rem ; i++){
                fact = fact * i;
            }
            sum= sum+fact;
            n=n/10;
        }

        if(sum==j){
            System.out.println("Strong Number");
        }else{
            System.out.println("not a Strong Number");
        }


    }
}
