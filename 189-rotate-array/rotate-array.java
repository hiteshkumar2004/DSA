class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
      int[] ans=new int[n];
      int m=0;
      for(int i=0;i<k;i++){
        ans[m++]=nums[n-k+i];
      }  
      for(int i=0;i<n-k;i++){
        ans[m++]=nums[i];
      }
      m=0;
      for(int a:ans){
        nums[m++]=a;
      }
      return;
    }
}