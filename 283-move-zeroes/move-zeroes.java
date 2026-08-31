class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null || nums.length<2)return;
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=0){
                int temp=nums[slow];
                nums[slow++]=nums[fast];
                nums[fast]=temp;
            }

        }
    }
}