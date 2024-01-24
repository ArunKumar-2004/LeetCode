class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        HashSet<String> set=new HashSet<>();
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int curr=nums[i]+nums[j];
                if(map.containsKey(-1*curr)){
                    int k=map.get(-1*curr);
                    String st=nums[i]+":"+nums[j]+":"+nums[k];
                    if(!set.contains(st) && i<k && j<k){
                        li.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        set.add(st);
                    }
                }
            }
        }
        return li;
    }
}