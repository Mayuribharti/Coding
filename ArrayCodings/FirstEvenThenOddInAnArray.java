package ArrayCodings;

import java.util.ArrayList;
import java.util.List;

public class FirstEvenThenOddInAnArray {
    public static void main(String[] args) {

        int a[] = {4,2,4,2,3,2,1,9,3,4,4,4,2,2,2};

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        List<Integer> newArray = new ArrayList<>();


        for(int i=0 ; i<a.length ; i++){
            if(a[i]%2==0){
                evenList.add(a[i]);
            }
            if(a[i]%2!=0){
                oddList.add(a[i]);

            }
        }

        newArray.addAll(evenList);
        newArray.addAll(oddList);
        System.out.println(newArray);

    }
}
