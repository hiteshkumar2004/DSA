class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        int i=0;
        while(i<n){
            while(i<n&&nums[i]==0   )i++;
            if(i<n){
                int t=nums[i];
                nums[i++]=nums[j];
                nums[j++]=t;
            }

        }
    }
}