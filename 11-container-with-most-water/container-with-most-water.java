class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int s=0;
        int e=n-1;
        int max=0;
        while(s<e){
            int dis=e-s;
            int contain=Math.min(height[s],height[e])*dis;
            max=Math.max(max,contain);
            if(height[s]<height[e])s++;
            else e--;
        }
        return max;
    }
}