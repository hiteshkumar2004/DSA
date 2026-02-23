class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int i=0;
        while(i<nums.length){
            while(i<nums.length&&nums[i]==0   )i++;
            if(i<nums.length){
                int t=nums[i];
                nums[i++]=nums[j];
                nums[j++]=t;
            }

        }
    }
}