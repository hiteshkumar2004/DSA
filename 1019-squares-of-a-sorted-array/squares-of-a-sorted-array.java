class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int k=n-1;
        int s=0,e=n-1;
        while(e>=s){
            int nums1=Math.abs(nums[s]);
            int nums2=Math.abs(nums[e]);
            if(nums1<nums2){
                ans[k--]=nums2*nums2;
                e--;
            }
            else{
                ans[k--]=nums1*nums1;
                s++;
            }
        }  
        return ans;
    }
  
}