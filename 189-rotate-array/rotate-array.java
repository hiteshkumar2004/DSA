class Solution {
    public void rotate(int[] nums, int k) {
    //     int n=nums.length;
    //     k=k%n;
    //   int[] ans=new int[n];
    //   int m=0;
    //   for(int i=0;i<k;i++){
    //     ans[m++]=nums[n-k+i];
    //   }  
    //   for(int i=0;i<n-k;i++){
    //     ans[m++]=nums[i];
    //   }
    //   m=0;
    //   for(int a:ans){
    //     nums[m++]=a;
    //   }
    //   return;
            //Solution 2
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);     
        reverse(nums, 0, k - 1);     
        reverse(nums, k, n - 1);     
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}


