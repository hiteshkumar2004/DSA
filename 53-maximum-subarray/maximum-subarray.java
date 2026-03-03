class Solution {
    public int maxSubArray(int[] nums) {
        int current = 0;
        int best = nums[0];

        for (int i = 0; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            best = Math.max(best, current);
        }

        return best;
    }
    
}