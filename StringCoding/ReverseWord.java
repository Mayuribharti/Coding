package StringCoding;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String s = scanner.nextLine();

        String sSplit[] = s.split(" ");

        for(int i=sSplit.length-1 ; i>=0 ; i--){
            System.out.println(sSplit[i]);
        }
    }
}
