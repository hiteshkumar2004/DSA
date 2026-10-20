class Solution {
    public void sortColors(int[] nums) {
        int s=0,m=0,e=nums.length-1;
        if(e==0)return;
        while(m<=e){
           // while(nums[e]==2)e--;
            if(nums[m]==0){
                int t=nums[m];
                nums[m]=nums[s];
                nums[s]=t;
                s++;
                m++;
            }
            else if(nums[m]==2){
                 int t=nums[m];
                nums[m]=nums[e];
                nums[e]=t;
                e--;
            }
            else{
                m++;
            }
            
            
        }
    }
}