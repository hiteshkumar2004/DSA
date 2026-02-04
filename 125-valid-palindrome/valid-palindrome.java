class Solution {
    public boolean isPalindrome(String s) {
         s=s.toLowerCase();
        // String ans="";
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(c>='a' &&c<='z' || c>='0'&& c<='9')ans+=c;
        // }
        // int i=0;
        // int j=ans.length()-1;
        // while(i<j){
        //     if(ans.charAt(i++)!=ans.charAt(j--))return false;
        // }
        // return true;

        //2nd way
        int i=0;
        int j=s.length()-1;
        while(j>i){
            while(j>i && !Character.isLetterOrDigit(s.charAt(i)))i++;
            while(j>i && !Character.isLetterOrDigit(s.charAt(j)))j--;
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}