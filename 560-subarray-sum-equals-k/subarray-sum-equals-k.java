class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> seen = new HashMap<Integer,Integer>();
        seen.put(0,1);
        int sum =0 ,count=0;
        for(int x:nums){
            sum+=x;
            count+=seen.getOrDefault(sum-k,0);
            seen.put(sum,seen.getOrDefault(sum,0)+1);
        }
    return count;
    }
}