package basics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter an Integer:");


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int prime=1;

        for(int i =2 ; i<=n/2 ; i++){
            if(n%i==0){
                prime=0;
                break;
            }
        }

        if(prime==0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
