package StringCoding;

import java.util.Scanner;

public class ReverseEachWordFromString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String sSplit[] = s.split(" ");
        for(int i =0 ; i<sSplit.length ; i++){
            String s1 = sSplit[i];

            for(int j=s1.length()-1 ; j>=0 ; j--){
                System.out.print(s1.charAt(j));
            }
            System.out.println();
        }

    }
}
