package ArrayCodings;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        int a[] = {2,4,1,6,9,7,9,2};

        for(int i =0 ; i<a.length ; i++){

            int x=a[i];
            if(x==-1)continue;

            int count =0;
            for(int j =0 ; j<a.length ; j++){
                if(x==a[j]){
                    count++;
                    a[j]=-1;
                }
            }
            if(count>=1){
                System.out.println(x);
            }

        }
    }
}
