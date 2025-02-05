package basics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        System.out.println("Enter two integers :");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcd=1;
        for(int i =1; i<=a && i<=b ; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }

        }
        System.out.println("GCD :"+gcd);
        int lcm = (a * b) / gcd;
        System.out.println("LCM :"+lcm);

    }
}
