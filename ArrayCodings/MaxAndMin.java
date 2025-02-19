package ArrayCodings;

public class MaxAndMin {

    public static void main(String[] args) {

        int arr[] = {4,2,6,4,2,1,1,9,7};
        int max = arr[0];
        int min = arr[0];

        for(int i =1 ; i< arr.length ; i++){
            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max :"+max+" ,Min :"+min);
    }
}
