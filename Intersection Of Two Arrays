class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0 ; i<nums1.length ; i++){
            if(!map1.containsKey(nums1[i])){
                map1.put(nums1[i],1);
            }
        }
        for(int i=0 ; i<nums2.length ; i++){
            if(map1.containsKey(nums2[i])){
                map2.put(nums2[i],1);
            }
        }
        int[] ans = new int[map2.size()];
        int index = 0;
        for(int i : map2.keySet()){
            ans[index] = i;
            index++;
        }
        return ans;
    }
}
