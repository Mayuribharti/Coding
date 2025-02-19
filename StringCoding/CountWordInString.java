package StringCoding;

import java.util.Scanner;

public class CountWordInString {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();

    String sSplit[] = s.split(" ");

    int count=0;
    for(int i =0 ; i<sSplit.length ; i++){
        count++;
    }

        System.out.println("Count : "+count);
    }
}
