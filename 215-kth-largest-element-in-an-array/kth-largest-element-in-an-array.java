class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:nums){
            if(pq.size()<k){
                pq.add(x);
            }
            else if(pq.peek()<x){
                pq.remove();
                pq.add(x);
            }
        }
        return pq.peek();
    }
}