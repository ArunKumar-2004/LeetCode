class Solution {
    boolean[][] dp;
    public boolean canCross(int[] stones){
        int n=stones.length;
        dp=new boolean[n][n];
        return Helper(stones,0,0);
    }

    public boolean Helper(int stones[],int curr,int jump){
        if(curr==stones.length-1){
            return true;
        }
        if(dp[curr][jump]){
            return false;
        }
        for(int next=curr+1;next<stones.length;next++){
            int nextJump=stones[next]-stones[curr];
            if(nextJump>=jump-1 && nextJump<=jump+1){
                if(Helper(stones,next,nextJump)){
                    return true;
                }
            }else if(nextJump>jump+1){
                break;
            }
        }
        dp[curr][jump]=true;
        return false;
    }
}
