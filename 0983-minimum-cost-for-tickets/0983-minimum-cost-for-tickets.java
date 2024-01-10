class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n+1];
        for ( int i = n-1; i >= 0; i--){
            int ans1 = costs[0] + dp[i+1];
            int ans2 = costs[1] + dp[getIndex(days,days[i]+7)];
            int ans3 = costs[2] + dp[getIndex(days,days[i]+30)];
            dp[i] = Math.min(Math.min(ans1,ans2),ans3);
        }
        return dp[0];
    }

    public int getIndex(int[] days, int target){
        int x = Arrays.binarySearch(days,target);
        if (x >= 0) return x;
        return Math.abs(x) - 1;
    }
}