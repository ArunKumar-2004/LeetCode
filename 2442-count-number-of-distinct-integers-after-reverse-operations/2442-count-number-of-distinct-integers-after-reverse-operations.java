class Solution {
    public int rev(int n){
        int rev=0;
        while(n!=0){
            rev=10*rev+n%10;
            n/=10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(rev(nums[i]));
        }
        return set.size();
    }
}