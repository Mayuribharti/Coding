package StringCoding;

import java.util.Scanner;

public class CountEachWordInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ssplit[] = s.split(" ");
        for(int i =0 ; i<ssplit.length ; i++){

            String s1= ssplit[i];
            if(s1.equals("1111"))continue;

            int count=0;
            for(int j =0 ; j<ssplit.length; j++){
                if(s1.equals(ssplit[j])){
                    count++;
                    ssplit[j]="1111";
                }

            }
            System.out.println(s1+" : "+count);

        }
    }
}
