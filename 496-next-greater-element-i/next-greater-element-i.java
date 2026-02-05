class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums2.length;i++)m.put(nums2[i],i);
        int i=0;
        while(i<nums1.length){
            int ind=m.get(nums1[i]);
            int num=-1;
            for (int j=ind+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                  num=nums2[j];
                  break;
                }
            }
            ans[i++]=num;
        }
        return ans;
    }
}