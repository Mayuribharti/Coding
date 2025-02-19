package ArrayCodings;

public class NumberOfOccurrences {
    public static void main(String[] args) {

        int a[] = {4,3,5,2,2,1,1,1,3,4,43,121,5};

        for(int i =0 ; i<a.length ; i++){
            int x = a[i];
            if(x==-1)continue;

            int count=0;
            for(int j=0 ; j<a.length ; j++){
                if(x==a[j]){
                    count++;
                    a[j]=-1;
                }
            }
            System.out.println(x+" : "+count);
        }
    }
}
