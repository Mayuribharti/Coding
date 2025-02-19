package StringCoding;

import java.util.Scanner;

public class FrequencyOfEachElement {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char ch[] = s.toCharArray();

        for(int i=0 ; i<ch.length ; i++){

            if(ch[i]=='4'){
                continue;
            }
            char x = ch[i];

            int count=0;
            for(int j=i+0 ; j<ch.length ; j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='4';
                }

            }
            System.out.println(x+" : "+count);
        }
    }
}
