class Solution {
    static int[] dp;
    public static int coinChange(int[] coins, int amount) {
        dp=new int[amount+1];
        for(int i=0;i<=amount;i++)dp[i]=-1;
        int ans=coin(coins,amount);
       return ans!=Integer.MAX_VALUE?ans:-1;

    }
    public static int coin(int[] coins,int amount){
     if(amount==0)return 0;
     if(amount<0)return Integer.MAX_VALUE;
     if(dp[amount]!=-1)return dp[amount];
     int min=Integer.MAX_VALUE;
        for (int coin : coins) {
            int ans = coin(coins, amount - coin);
            if (ans != Integer.MAX_VALUE) {
                min = Math.min(min, ans + 1);
            }
        }
        dp[amount]=min;
       return dp[amount];
    }
}