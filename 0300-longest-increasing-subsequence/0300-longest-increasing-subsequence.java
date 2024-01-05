class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==1) return 1;
        int[] dp=new int[nums.length];
        int ret=-1;
        dp[0]=1;
        for(int i=1;i<nums.length;i++){
            int max=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    max= max<(dp[j]+1) ? dp[j]+1 : max;
                }
            }
            dp[i]=max;
            if(ret<dp[i])
                ret=dp[i];
        }
        return ret;
    }
}