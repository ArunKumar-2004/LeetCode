class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int least=nums[0]*nums[1];
        int max=nums[nums.length-1]*nums[nums.length-2];
        return max-least;
    }
}