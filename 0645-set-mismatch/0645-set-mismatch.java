class Solution {
        public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=nums.length,i=0;
        int ans[]=new int[2];
        for(i=0;i<n;i++){
            if(map.containsKey(nums[i])){
            ans[0]=nums[i];
            }
            else{
            map.put(nums[i],1);
            }
        }
        for(i=1;i<=nums.length;i++){
         if(!map.containsKey(i))   
          ans[1]=i; 
        }
       return ans;
    }
}