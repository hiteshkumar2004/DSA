class Solution {
    public int maxArea(int[] height) {
     int max=0;
     int s=0,e=height.length-1;
     while(e>s){
        int d=e-s;
        if(height[e]>height[s]){
            int t=d*height[s];
            if(max<t) max=t;
            s++;
        }
        else{
            int t=d*height[e];
            if(max<t) max=t;
            e--;
        }
     }  
     return max;
    }
}