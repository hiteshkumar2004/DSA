package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int [] arr2={2,3,4,5};
        int[] marr=new int[8];
        marr=merge(arr1,arr2);
        for(int n:marr){
            System.out.print(n+" ");
        }
    }
    static int [] merge(int[] a,int[] b){
        int[] marr=new int[8];
        int k=0;
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j])marr[k]=a[i++];
            else marr[k]=b[j++];
            k++;
        }
        while(i<a.length){
            marr[k]=a[i++];
            k++;
        }
        while(j<b.length){
            marr[k]=b[j++];
            k++;
        }
        return marr;
    }
}
