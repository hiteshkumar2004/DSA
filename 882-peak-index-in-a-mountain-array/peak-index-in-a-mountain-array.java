class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length;
        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m]>arr[m-1] && arr[m]>arr[m+1]){
                return m;
            }
            if(arr[m]<arr[m+1]&& arr[m]>arr[m-1]){
                s+=1;
            }
            else{
                e-=1;
            }
        }
        return -1;
    }
}