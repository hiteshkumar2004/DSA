class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int slow=0;
        int count=1;
        for(int fast=0;fast<n;fast++){
            if(nums[fast]!=nums[slow]){
                nums[++slow]=nums[fast];
                count++;
            }
        }
        return count;
    }
}