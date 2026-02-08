class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        if(k==0)return false;
        if(k>n)k=n;
        int  i=0;
        int j=1;
        while(i<n-1 ){
            while(j<=k+i && j<n){
                if(nums[i]==nums[j++])return true;
            }
            i++;
            j=i+1;
        }
        return false;
    }
}