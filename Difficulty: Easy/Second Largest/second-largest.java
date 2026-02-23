class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        PriorityQueue<Integer> pq=new  PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(pq.contains(arr[i]))continue;
              pq.add(arr[i]);
            if(pq.size()>2){
                pq.remove();
            }
        }
        return pq.size()==2?pq.peek():-1;
    }
}