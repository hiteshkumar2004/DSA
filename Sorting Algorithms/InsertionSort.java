package Array;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,5,4,7,5,88,97,3};
        for (int i = 1; i <arr.length; i++) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int t=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=t;
                j--;
            }
            for (int n:arr){
                System.out.print(n+" ");
            }
        }
    }
}
