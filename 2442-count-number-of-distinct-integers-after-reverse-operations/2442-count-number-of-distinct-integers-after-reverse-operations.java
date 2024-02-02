class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(Integer.parseInt(new StringBuilder(Integer.toString(nums[i])).reverse().toString()));
        }
        return set.size();
    }
}