class Solution {
    boolean flag[];
    public int longestSubarray(int[] nums) {
        int count,max=0;
        flag=new boolean[nums.length];
        if(AllOne(nums)){
            return nums.length-1;
        }
        if(AllZero(nums)){
            return 0;
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(int i:nums){
            li.add(i);
        }
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                li.remove(i);
                count=0;
                for(int j=0;j<li.size();j++) {
                    if(li.get(j)==1) {
                        count++;
                        max=Math.max(max, count);
                    }else{
                        count=0;
                    }
                }
                li.add(i,0);
            }
        }
        return max;
    }
    public boolean AllOne(int nums[]){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                return false;
            }
        }
        return true;
    }
    public boolean AllZero(int nums[]){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                return false;
            }
        }
        return true;
    }
}