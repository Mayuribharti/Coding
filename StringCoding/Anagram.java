package StringCoding;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {


     static int getCountOfString(String str){
         int count=0;
         for(int i =0 ; i<str.length(); i++){
             count++;
         }
             return count;
    }

    static char[] sortString(char ch[]){
         for(int i =0 ; i< ch.length ; i++) {

             char temp;
             for (int j = i + 1; j < ch.length; j++) {
                 if (ch[i] > ch[j]) {
                     temp = ch[i];
                     ch[i] = ch[j];
                     ch[j] = temp;
                 }
             }
         }
        return ch;
    }
    public static void main(String[] args) {
        //"listen" → "silent"

        System.out.println("Enter two String : ");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int countOfS1 = getCountOfString(s1);
        int countOfs2 = getCountOfString(s2);

        char ch1[] = s1.toCharArray();
        char ch2[] =s2.toCharArray();



        if(countOfs2==countOfS1){
            if (Arrays.equals(sortString(ch1), sortString(ch2))) {
                System.out.println(s1 + " and " + s2 + " are anagrams");
            }else{
                System.out.println(s1+" and "+s2 +" are not anagram");
            }
        }
        else{
            System.out.println(s1+" and "+s2 +" are not anagram");
        }

    }
}
