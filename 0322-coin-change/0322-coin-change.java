class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer[] dp = new Integer[amount+1];
        dp[0] = 0;        
        for(int i=1; i <= amount; i++){        
            for(int coin : coins){
                if(i >= coin && dp[i-coin] != null) {
                    if(dp[i] != null)
                        dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                    else
                        dp[i] = 1 + dp[i - coin];
                }
            }
        }
        return dp[amount] == null ? -1 : dp[amount];
    }
}