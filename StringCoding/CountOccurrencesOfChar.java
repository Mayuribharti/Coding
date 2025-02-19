package StringCoding;

import java.util.Scanner;

public class CountOccurrencesOfChar {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int count=0;
        char ch = 'a';
        for(int i =0 ; i<s.length() ; i++){
            if(ch==s.charAt(i)){
                count++;
            }
        }
        System.out.println("Count of "+ch+" : "+count);
    }

}
