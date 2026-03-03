class Solution {
    public int removeDuplicates(int[] nums) {
        // int i=0,j=0;
        // int k=0;
        // while(i<nums.length){
        //     while(i<nums.length&&nums[i]==nums[j] ) i++;
        //     nums[k++]=nums[j];
        //     j=i;
        // }
        // return k;
        int[] ans=Arrays.stream(nums).distinct().toArray();
        for(int i=0;i<ans.length;i++){
            nums[i]=ans[i];
        }
        return ans.length;
    }
}