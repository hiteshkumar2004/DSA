package Array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,5,4,7,5,88,97,3};
        for (int i = 0; i < arr.length-1; i++) {
            int small=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(small>arr[j]){
                    int temp=small;
                    small=arr[j];
                    arr[j]=temp;
                }
                arr[i]=small;
            }
        }for (int n:arr){
            System.out.print(n+" ");
        }
    }
}
