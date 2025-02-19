package Java_8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

      boolean prime = IntStream.rangeClosed(2,n/2).noneMatch(i->n%i==0);
        if(prime){
            System.out.println(n+" is prime");
        }else{
            System.out.println(n+" is not prime");
        }

    }
}
