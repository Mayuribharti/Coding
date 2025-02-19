package StringCoding;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for(int i=s.length()-1 ; i>=0 ; i--){
            System.out.println(s.charAt(i));
        }
    }
}
