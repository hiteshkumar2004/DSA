class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0) return 0;
        HashSet<Character> uniqueChar=new HashSet<>();
        int l=0;
        int maxSize=0;
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            while(uniqueChar.contains(c)){
                char f=s.charAt(l);
                uniqueChar.remove(f);
                l++;
            }
            uniqueChar.add(c);
            maxSize=Math.max(maxSize,uniqueChar.size());
        }
        return maxSize;
    }
}