class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        boolean dp[]=new boolean[nums.length+1];
        Arrays.fill(dp,false);
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(dp[nums[i]]){
                li.add(nums[i]);
            }
            dp[nums[i]]=true;
        }
        // System.out.print(li);
        return li;
    }
}