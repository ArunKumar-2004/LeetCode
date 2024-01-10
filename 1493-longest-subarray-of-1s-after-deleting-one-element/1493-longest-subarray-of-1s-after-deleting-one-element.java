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
            if(nums[i]==0){
                int val=li.remove(i);
                count=FindOne(li,i);
                li.add(i,val);
            }
            max=Math.max(max,count);
        }
        return max;
    }
    public int FindOne(List<Integer> li,int start){
        int c=0;
        int max=0;
        for(int i=0;i<li.size();i++){
            if(li.get(i)==1){
                c++;
                max=Math.max(max,c);
            }else{
                c=0;
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