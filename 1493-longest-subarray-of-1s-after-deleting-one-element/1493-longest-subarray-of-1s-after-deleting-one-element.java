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
        for(int i=0;i<nums.length;i++){
            count=0;
            int c=0;
            if(nums[i]==1){
                for(int j=i;j<nums.length;j++){
                    if(j<nums.length-1 && nums[j]==0 && nums[j+1]==0){
                        break;
                    }else if(nums[j]==0){
                        c++;
                        if(c==2){
                            break;
                        }
                        continue;
                    }
                    count++;
                }
            }
            max=Math.max(max,count);
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