package ArrayCodings;

public class SortedArray {
    public static void main(String[] args) {

        int a[] ={3,1,4,2,1,4,2,1};

        int temp;
        for(int i =0 ; i<a.length ; i++){
            for(int j =i+1; j<a.length ; j++){
                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }

            }
        }
        for(int i =0 ; i< a.length ; i++){
            System.out.println(a[i]);
        }
    }
}
