package Array;

public class MergeSort {
    public static void main(String[] args) {
        int[] a={5,3,8,7,9,78,35};
        int[] b=mergeSort(a);
        for(int n:b){
            System.out.print(n+" ");
        }
    }

    private static int[] mergeSort(int[] a) {
        if(a.length==1) return a;
        int[] f1=new int[a.length/2];
        int[] f2=new int[a.length-(a.length/2)];
        int j=0;
        for (int i = 0; i < f1.length; i++) {
            f1[i]=a[j++];
        }
        for (int i = 0; i < f2.length; i++) {
            f2[i]=a[j++];
        }
        int[] c=mergeSort(f1);
        int[] d=mergeSort(f2);
        return merge(c,d);

    }
    static int [] merge(int[] a,int[] b){
        int[] marr=new int[a.length+b.length];
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
